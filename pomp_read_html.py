"""
 Created by 北冥云鹏 on 2019/7/20 18:15.
 微信公众号：泉头活水
"""
import os
import re

class MySpiderHtml():
    def __init__(self):
        self.results = []

    def getAllData(self, file):
        html_file = open('{}\\overview.html'.format(file), 'r', encoding="utf-8")
        html_content = html_file.read()
        s1 = re.findall('id="meta"([\s\S]*)id="systemInfo"', html_content)
        now = re.findall('at ([\s\S]*)\n', s1[0])
        passed = re.findall('<td class="passed number">(.*)</td>', html_content)
        skipped = re.findall('<td class="zero number">(.*)</td>', html_content)
        failed = re.findall('<td class="failed number">(.*)</td>', html_content)
        self.results.append("执行时间：{}".format(now[0]))
        self.results.append("通过：{}".format(passed[0]))
        self.results.append("忽略：{}".format(skipped[0]))
        if len(failed) != 0:
            self.results.append("失败：{}".format(failed[0]))
        print(self.results)

        if not os.path.exists('{}\\index.txt'.format(file)):
            with open('{}\\index.txt'.format(file), 'w'):
                pass

        with open('{}\\index.txt'.format(file), 'w+', encoding="UTF-8") as fileObject:
            for r in self.results:
                fileObject.write(r + '\n')
                fileObject.write("====================================")


if __name__ == '__main__':
    # file = "F:\\AKETEST\\UIAUTOTEST_POMP\\test-output\\html"  # 本机
    file = "E:\workspace\\uiDaily_test\\test-output\\html"  # 展示电脑
    my_html = MySpiderHtml()
    my_html.getAllData(file)