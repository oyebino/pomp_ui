"""
 Created by 北冥云鹏 on 2019/7/20 18:15.
 微信公众号：泉头活水
"""
import os
import re

class MySpiderHtml():
    def __init__(self):
        self.results = []
        self.filePath = os.path.split(os.path.realpath(__file__))[0]

    def getAllData(self):
        html_file = open('{}\\test-output\\TEST-TestSuite.xml'.format(self.filePath), 'r', encoding="utf-8")
        html_content = html_file.read()
        tests = re.findall('tests="(.*)" errors', html_content)[0]
        errors = re.findall('errors="(.*)" skipped', html_content)[0]
        skipped = re.findall('skipped="(.*)" failures', html_content)[0]
        failures = re.findall('failures="(.*)">', html_content)[0]
        passed = int(tests[0]) - int(errors) - int(skipped) - int(failures)
        self.results.append("通过：{}".format(passed))
        self.results.append("错误：{}".format(errors))
        self.results.append("忽略：{}".format(skipped))
        self.results.append("失败：{}".format(failures))
        return self.results

    def writeToFile(self,file):
        results = self.getAllData()
        if not os.path.exists('{}\\index.txt'.format(file)):
            with open('{}\\index.txt'.format(file), 'w'):
                pass

        with open('{}\\index.txt'.format(file), 'w+', encoding="UTF-8") as fileObject:
            for r in results:
                fileObject.write(r + '\n')
                fileObject.write("====================================")
import time
import yagmail
import os
"""
author by:yyb
descripe:发送邮件
"""
class Mail():
    def __init__(self):
        self.yag = yagmail.SMTP(user="10219@akeparking.cn", password="Ake01997", host="hwsmtp.exmail.qq.com")
        self.tm = time.strftime("%Y-%m-%d %H:%M:%S", time.localtime(time.time()))
        self.subject = "uiDaily自动化报告_"+self.tm

        self.htmlBody = ",".join(MySpiderHtml().getAllData())
        print(self.htmlBody)

        self.contents = [self.htmlBody, os.path.join(os.path.dirname(__file__), 'test-output\\html\\suite1_test1_results.html')]

    def send(self,receiver):
        if "通过：3" in self.htmlBody:
            pass
        else:
            self.yag.send(to=receiver,subject = self.subject,contents = self.contents)


from twilio.rest import Client
"""
author by:yyb
descripe:发送手机短信
"""
class SMS():
    def __init__(self):
        self.tm = time.strftime("%Y-%m-%d %H:%M:%S", time.localtime(time.time()))

    def sendPhoneMessage(self,toPhone):
        sid = 'ACedd13f6bde6bdc9fb3797888dce29572'
        token = 'cda1b783bbb549e46126a2572cd5a01f'
        client = Client(sid, token)
        report = ",".join(MySpiderHtml().getAllData())
        body_message = "uiDaily自动化测试" + self.tm + " 测试结果为：【" + report + "】"
        if "通过：3" in report:
            pass
        else:
            client.messages.create(body=body_message, from_='+12055284403', to=toPhone)

if __name__ == '__main__':
    # file = "F:\\AKETEST\\UIAUTOTEST_POMP\\test-output"  # 本机
    file = "E:\workspace\\uiDaily_test\\test-output"  # 展示电脑
    my_html = MySpiderHtml()
    my_html.writeToFile(file)
    Mail().send("10219@akeparking.cn")
    SMS().sendPhoneMessage("+8613531412589")
