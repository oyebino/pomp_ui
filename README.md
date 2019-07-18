# UIAUTOTEST_POMP

## 工程目录

- Project/:  系统名称
  - base  UI测试基础类
  - plugins.arrow  测试用例监控类
  - Config/： 配置文件
  - res/driver 浏览器驱动
  - res/page 元素定位
  - res/testcase 用例文件
  - util 工具类文件
  - data 存放公共数据，以及运行过程保存的数值
  - result  存放结果（包括日志，截图等）
  - test_case/： 接口测试用例
  - util.TestCaseFactoryForAll:  根据excel表的用例，自动生成java用例文件
  - testNG.xml  用例集运行触发入口

## 环境配置
* jdk 1.8    
* idea/eclipse     
* maven

## 实现功能
- XML管理元素对象信息 
- 统一的操作API风格，action.操作(某个页面.某个元素）
- 数据驱动 
- 关键字驱动 
- 用例失败自动截图并展示到报表中 
- 自动生成html报表 
- 用例串行一次性执行多个浏览器，可用于兼容性测试


## 说明
1. 该项目为maven项目，首次执行先把pom下的相关依赖包下载
```
cd /d porject
maven install
```
2. res/page下创建userPage.xlsx文件，内容如下：
![元素定位编写](http://172.18.3.40:3000/yeyb/UIAUTOTEST_POMP/src/master/img-folder/page.png)

3. res/testcase 下编写用例use.xlsx，每个sheet为一个用例编号，内容如下：
![用例表编写](http://172.18.3.40:3000/yeyb/UIAUTOTEST_POMP/src/master/img-folder/testcase.png)

4. 执行util.TestCaseFactoryForAll.java 文件会按照testcase下的excel表的sheet生成src/text下的用例文件名字是sheet用例编号，如下：

5. testng.xml配置，按要求配置对应参数 ，并添加运行的用例集，如：
```
<test name="G_账号管理" preserve-order="true">
	<classes preserve-order="true">
		<class name="com.wymall.test.testcases.system.user.UserPage_001_addUser_Test" />
		<class name="com.wymall.test.testcases.system.user.UserPage_002_setRole_Test" />
		<class name="com.wymall.test.testcases.system.user.UserPage_003_setParkingGroup_Test" />
	</classes>
</test>
```

6. 运行可以通过testNG.xml运行，也可以通过pom构建运行
 - testNG.xml: 右击testNG文件-->run as --> testNG suit

 - pom.xml :   右击pom文件-->run as --> Maven Test

7. 查看测试报告及日志文件
用例执行完毕，会自动生成测试报告文件；用例失败会自动截图并将其展示在报告中，测试报告文件生成在项目根目录下test-out/html目录下report.html文件 报告展示如下：
![报告](http://172.18.3.40:3000/yeyb/UIAUTOTEST_POMP/src/master/img-folder/report.png)
