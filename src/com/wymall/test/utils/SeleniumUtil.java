package com.wymall.test.utils;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.codehaus.plexus.util.FileUtils;
import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.ITestResult;

import com.wymall.test.utils.actions.ParamConstant;
import com.wymall.test.utils.actions.impl.FindElement;
import com.wymall.test.utils.commons.xml.XmlHander;


/**
 * @author xy-incito-wy
 * @Description 包装所有selenium的操作以及通用方法，简化用例中代码量
 * */
public class SeleniumUtil {
	/** 使用Log4j，第一步就是获取日志记录器，这个记录器将负责控制日志信息 */
	public static Logger logger = Logger.getLogger(SeleniumUtil.class.getName());
	public ITestResult it = null;
	public WebDriver driver = null;
	public WebDriver window = null;
	public String current_handles="";
	private XmlHander xmlHander = new XmlHander();



	/***
	 * 启动浏览器并打开页面
	 * */
	public void launchBrowser(String browserName, ITestContext context,String webUrl,int timeOut) {
		SelectBrowser select = new SelectBrowser();
		driver = select.selectExplorerByName(browserName, context);
		try {
			maxWindow(browserName);
			waitForPageLoading(timeOut);
			get(webUrl);
		} catch (TimeoutException e) {
			logger.warn("注意：页面没有完全加载出来，刷新重试！！");
			refresh();
			 JavascriptExecutor js = (JavascriptExecutor)driver;
			String status= (String)js.executeScript("return document.readyState");
			logger.info("打印状态："+status);
		}

	}


	/**
	 * 最大化浏览器操作
	 * */
	public void maxWindow(String browserName) {
		logger.info("最大化浏览器:" + browserName);
		driver.manage().window().maximize();
	}

	/**
	 * 设定浏览器窗口大小： 设置浏览器窗口的大小有下面两个比较常见的用途：<br>
	 * 1、在统一的浏览器大小下运行用例，可以比较容易的跟一些基于图像比对的工具进行结合
	 * ，提升测试的灵活性及普遍适用性。比如可以跟sikuli结合，使用sikuli操作flash；<br>
	 * 2、在不同的浏览器大小下访问测试站点，对测试页面截图并保存，然后观察或使用图像比对工具对被测页面的前端样式进行评测。
	 * 比如可以将浏览器设置成移动端大小(320x480)，然后访问移动站点，对其样式进行评估；<br>
	 * */
	public void setBrowserSize(int width, int height) {
		driver.manage().window().setSize(new Dimension(width, height));
	}

	/**
	 * 包装查找元素的方法 element
	 * */
	public WebElement findElementBy(By by) {
		return driver.findElement(by);
	}

	/**
	 * 包装查找元素的方法 elements
	 * */
	public List<WebElement> findElementsBy(By by) {
		return driver.findElements(by);
	}

	/**导航链接到url*/
	public void navigateTargetUrl(String url){
		driver.navigate().to(url);
		logger.info("导航到："+url);
	}

	/**
	 * 包装点击操作- By
	 * */
	public void click(By byElement) {
		waitForElementToLoad(10,byElement);
		try {
			clickTheClickable(byElement, System.currentTimeMillis(), 2500);
		} catch (StaleElementReferenceException e) {
			logger.error("The element you clicked:[" + byElement + "] is no longer exist!");
			Assert.fail("The element you clicked:[" + byElement + "] is no longer exist!");
		} catch (Exception e) {
			logger.error("Failed to click element [" + byElement + "]");
			Assert.fail("Failed to click element [" + byElement + "]",e);
		}
		logger.info("点击元素 [" + byElement + "]");
		loadPage();
	}

	public boolean isEnabled(By by){
		waitForElementToLoad(10,by);
		return driver.findElement(by).isEnabled();
	}

	/**提交*/
	public void submit(WebElement w){
		try{
		w.submit();

		}catch(Exception e){
			logger.error("在元素："+w+"做的提交操作失败");
			Assert.fail("在元素："+w+"做的提交操作失败");
		}
		logger.info("在元素："+w+"做了提交操作");
	}

	/**
	 * 包装点击操作 -webelment
	 * */
	public void click(WebElement element) {

		try {
			element.click();
		} catch (StaleElementReferenceException e) {
			logger.error("The element you clicked:[" + element.toString() + "] is no longer exist!");
			Assert.fail("The element you clicked:[" + element.toString() + "] is no longer exist!");
		} catch (Exception e) {
			logger.error("Failed to click element [" + element.toString() + "]");
			Assert.fail("Failed to click element [" + element.toString() + "]",e);
		}
		logger.info("点击元素 [" + element.toString() + "]");
	}

	/** 不能点击时候重试点击操作 */
	public void clickTheClickable(By byElement, long startTime, int timeOut) throws Exception {
		try {
			findElementBy(byElement).click();
		} catch (Exception e) {
			if (System.currentTimeMillis() - startTime > timeOut) {
				logger.warn(byElement+ " is unclickable");
				throw new Exception(e);
			} else {
				Thread.sleep(500);
				logger.warn(byElement + " is unclickable, try again");
				clickTheClickable(byElement, startTime, timeOut);
			}
		}
	}

	/**
	 * 获得页面的标题
	 * */
	public String getTitle() {
		return driver.getTitle();
	}

	/**
	 * 获得元素的文本
	 * */
	public String getText(By elementLocator) {
		return driver.findElement(elementLocator).getText().trim();
	}

	/**
	 * 获得元素 属性的值
	 * */
	public String getAttributeText(By elementLocator, String attribute) {
		return driver.findElement(elementLocator).getAttribute(attribute).trim();
	}

	/**
	 * 包装清除操作
	 * */
	public void clear(By byElement) {
		waitForElementToLoad(10, byElement);
		try {
			findElementBy(byElement).clear();
		} catch (Exception e) {
			logger.error("清除元素 [" + byElement + "] 上的内容失败!");
		}
		logger.info("清除元素 [" + byElement  + "]上的内容");
	}

	/**
	 * 向输入框输入内容
	 * */
	public void type(By byElement, String key) {
		waitForElementToLoad(10, byElement);
		try {
			if (!getAttributeText(byElement, "type").equals("file")) {
				findElementBy(byElement).click();
				pressCtrlAndA();
			}
			findElementBy(byElement).sendKeys(key);
			waitMilliSecond(250);
		} catch (Exception e) {
			e.printStackTrace();
			logger.error("输入 [" + key + "] 到 元素[" + byElement + "]失败");
			Assert.fail("输入 [" + key + "] 到 元素[" + byElement + "]失败", e);
		}
		logger.info("输入：[" + key + "] 到 [" + byElement + "]");
	}

	/**
	 * 模拟键盘操作的,比如Ctrl+A,Ctrl+C等 参数详解：<br>
	 * 1、WebElement element - 要被操作的元素 <br>
	 * 2、Keys key- 键盘上的功能键 比如ctrl ,alt等 <br>
	 * 3、String keyword - 键盘上的字母
	 * */
	public void pressKeysOnKeyboard(WebElement element, Keys key, String keyword) {

		element.sendKeys(Keys.chord(key, keyword));
	}

	/**
	 * 在给定的时间内去查找元素，如果没找到则超时，抛出异常
	 * */
	public void waitForElementToLoad(int timeOut, final By By) {
		logger.info("开始查找元素[" + By + "]");
		try {
			(new WebDriverWait(driver, timeOut)).until(new ExpectedCondition<Boolean>() {

				public Boolean apply(WebDriver driver) {
					WebElement element = driver.findElement(By);
					return element.isDisplayed();
				}
			});
		} catch (TimeoutException e) {
			logger.error("超时!! " + timeOut + " 秒之后还没找到元素 [" + By + "]");
			Assert.fail("超时!! " + timeOut + " 秒之后还没找到元素 [" + By + "]");

		}
		logger.info("找到了元素 [" + By + "]");
	}

	/**
	 * 在给定的时间内查询元素，共尝试三次，如果第三次还是找不到就报错，这就可能是网页性能问题了，响应速度不够
	 * */
	public void FindElementUtil3TimesTry(int timeOut, final By By ) {
	 int find=0;
		int notFindTimes = 0;
		boolean flag = true;
		while(flag){
			if(notFindTimes==3){
				logger.error("尝试了3次查找都未查找到元素："+By+"请检查是不是网络或者网站性能问题（响应速度不够）");
				Assert.fail("尝试了3次查找都未查找到元素："+By+"请检查是不是网络或者网站性能问题（响应速度不够）");
			}
		logger.info("开始第"+(notFindTimes+1)+"次查找元素[" + By + "]");
		try {
			(new WebDriverWait(driver, timeOut)).until(new ExpectedCondition<Boolean>() {

				public Boolean apply(WebDriver driver) {
					WebElement element = driver.findElement(By);
					return element.isDisplayed();
				}
			});
			find++;
		} catch (TimeoutException e) {
			logger.warn("超时!! " + timeOut + " 秒之后还没找到元素 [" + By + "],这是第"+(notFindTimes+1)+"次查找！");
			notFindTimes++;
			if(notFindTimes<3){
			refresh();
			}
		}


		if(notFindTimes>0&find!=1){
			flag = true;
		}else{
			flag = false;
		}


		}

		logger.info("找到了元素 [" + By + "]");
	}

	/**
	 * 判断文本是不是包含需求要求的文本一致
	 * **/
	public void isTextCorrect(String actual, String expected) {
		try {
			Assert.assertTrue(actual.contains(expected));
		} catch (AssertionError e) {
			logger.error("期望的文字是 [" + expected + "] 但是找到了 [" + actual + "]");
			Assert.fail("期望的文字是 [" + expected + "] 但是找到了 [" + actual + "]");

		}
		logger.info("找到了期望的文字: [" + expected + "]");

	}

	/*
	 * 检查文本不包含检查值
	 *
	 */
	public void isNotTextCorrect(String actual, String expected) {
		try {
			Assert.assertFalse(actual.contains(expected));
		} catch (AssertionError e) {
			logger.error("期望的文字是 [" + expected + "] 但是找到了 [" + actual + "]");
			Assert.fail("期望的文字是 [" + expected + "] 但是找到了 [" + actual + "]");

		}
		logger.info("期望文本: [" + expected + "]不存在");
	}
	
	
	/**
	 * 判断编辑框是不是可编辑
	 * */
	public void isInputEdit(WebElement element) {

	}

	/**
	 * 等待alert出现
	 * */
	public Alert switchToPromptedAlertAfterWait(long waitMillisecondsForAlert) throws NoAlertPresentException {
		final int ONE_ROUND_WAIT = 200;
		NoAlertPresentException lastException = null;

		long endTime = System.currentTimeMillis() + waitMillisecondsForAlert;

		for (long i = 0; i < waitMillisecondsForAlert; i += ONE_ROUND_WAIT) {

			try {
				Alert alert = driver.switchTo().alert();
				return alert;
			} catch (NoAlertPresentException e) {
				lastException = e;
			}
				try {
					Thread.sleep(ONE_ROUND_WAIT);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			if (System.currentTimeMillis() > endTime) {
				break;
			}
		}
		throw lastException;
	}

	/**
	 * 暂停当前用例的执行，暂停的时间为：sleepTime
	 * */
	public void pause(int sleepTime) {
		if (sleepTime <= 0) {
			return;
		}
		try {
			TimeUnit.SECONDS.sleep(sleepTime);
			logger.info("暂停:"+sleepTime+"秒");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

	/**
	 * 退出
	 * */
	public void quit() {
		driver.quit();
	}

	/**
	 * 切换frame - 根据String类型（frame名字）
	 * */
	public void inFrame(String frameId) {
		driver.switchTo().frame(frameId);
	}

	/**
	 * 切换frame - 根据frame在当前页面中的顺序来定位
	 * */
	public void inFrame(int frameNum) {
		driver.switchTo().frame(frameNum);
	}

	/**
	 * 切换frame - 根据页面元素定位
	 * */
	public void switchFrame(By byElement) {
		try {
			logger.info("Start switching to frame [" + byElement + "]");
			driver.switchTo().frame(findElementBy(byElement));
		} catch (Exception e) {
			logger.info("Switch to frame [" + byElement + "] failed");
			Assert.fail("Switch to frame [" + byElement + "] failed");
		}
		logger.info("Switch to frame [" + byElement + "] successed");
	}

	/**
	 * 选择下拉选项 -根据value
	 * */
	public void selectByValue(By by, String value) {
		waitForElementToLoad(10, by);
		Select s = new Select(driver.findElement(by));
		s.selectByValue(value);
	}

	/**
	 * 选择下拉选项 -根据index角标
	 * */
	public void selectByIndex(By by, int index) {
		waitForElementToLoad(10, by);
		Select s = new Select(driver.findElement(by));
		s.selectByIndex(index);
	}

	/** 检查checkbox是不是勾选 */
	public boolean doesCheckboxSelected(By elementLocator) {
		waitForElementToLoad(10, elementLocator);
		if (findElementBy(elementLocator).isSelected() == true) {
			logger.info("CheckBox: " + getLocatorByElement(findElementBy(elementLocator), ">") + " 被勾选");
			return true;
		} else
			logger.info("CheckBox: " + getLocatorByElement(findElementBy(elementLocator), ">") + " 没有被勾选");
		return false;

	}

	/**
	 * 选择下拉选项 -根据文本内容
	 * */
	public void selectByText(By by, String text) {
		driver.findElement(by).click();
		waitMilliSecond(500);
		List<WebElement> objs =driver.findElements(by.xpath("//ul[@class='el-scrollbar__view el-select-dropdown__list']/li"));
		for(WebElement obj:objs){
			if(obj.getText().trim().equals(text)){
				waitMilliSecond(1000);
				obj.click();
				logger.info("你选择了："+text);
				break;
			}
		}
	}

	/**
	 * 获得当前select选择的值
	 * */
	public String getCurrentSelectValue(By by){

		Select s = new Select(driver.findElement(by));
		WebElement e =  s.getFirstSelectedOption();
			return e.getText().trim();
	}

	/**
	 * 获取下拉列表的所有选项
	 * @param By：By元素对象
	 * @return 返回所有下拉列表中的选项，如option1,option2,……
	 * */
	public String getSelectOption(By by) {
		String value = null;
		Select s = new Select(driver.findElement(by));
		List<WebElement> options = s.getOptions();
	    for(int i = 0 ; i< options.size() ; i++){
			value = value + "," + options.get(i).getText();
		}
		return value.replace("null,","");
	}

	/**
	 * 执行JavaScript 方法
	 * */
	public void executeJS(String js) {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		((JavascriptExecutor) driver).executeScript(js);
		logger.info("执行JavaScript语句：[" + js + "]");
	}

	/**
	 * 获得输入框的值 这个方法 是针对某些input输入框 没有value属性，但是又想取得input的 值得方法
	 * */
	public String getInputValue(String chose,String choseValue) {
		String value = null;
		switch(chose.toLowerCase().substring(0,1).charAt(0)){
		case 'n':		//name的属性
			 String jsName = "return document.getElementsByName('"+choseValue+"')[0].value;"; //把JS执行的值 返回出去
			 value = (String)((JavascriptExecutor) driver).executeScript(jsName);
			 break;

		case 'i':	//id的属性
			 String jsId = "return document.getElementById('"+choseValue+"').value;"; //把JS执行的值 返回出去
			 value = (String)((JavascriptExecutor) driver).executeScript(jsId);
			 break;

			default:
				logger.error("未定义的chose:"+chose);
				Assert.fail("未定义的chose:"+chose);

		}
		return value;

	}

	/**
	 * 执行JavaScript 方法和对象
	 * 用法：seleniumUtil.executeJS("arguments[0].click();", seleniumUtil.findElementBy(MyOrdersPage.MOP_TAB_ORDERCLOSE));
	 * */
	public void executeJSObj(String js, Object...args) {
		((JavascriptExecutor) driver).executeScript(js, args);
		logger.info("执行JavaScript语句：[" + js + "]");
	}


	/**
	 * get方法包装
	 * */
	public void get(String url) {
		driver.get(url);
		logger.info("打开测试页面:[" + url + "]");
	}

	/**
	 * close方法包装
	 * */
	public void close() {
		driver.close();
	}

	/**
	 * 刷新方法包装
	 * */
	public void refresh() {
		driver.navigate().refresh();
		logger.info("页面刷新成功！");
	}

	/**
	 * 后退方法包装
	 * */
	public void back() {
		driver.navigate().back();
	}

	/**
	 * 前进方法包装
	 * */
	public void forward() {
		driver.navigate().forward();
	}

	/**
	 * 包装selenium模拟鼠标操作 - 鼠标移动到指定元素
	 * */
	public void mouseMoveToElement(By by) {
		Actions builder = new Actions(driver);
		Actions mouse = builder.moveToElement(driver.findElement(by));
		mouse.perform();
	}

	/**
	 * 包装selenium模拟鼠标操作 - 鼠标移动到指定元素
	 * */
	public void mouseMoveToElement(WebElement element) {
		Actions builder = new Actions(driver);
		Actions mouse = builder.moveToElement(element);
		mouse.perform();
	}

	/**
	 * 包装selenium模拟鼠标操作 - 鼠标右击
	 * */
	public void mouseRightClick(By element) {
		Actions builder = new Actions(driver);
		Actions mouse = builder.contextClick(findElementBy(element));
		mouse.perform();
	}

	/**
	 * 添加cookies,做自动登陆的必要方法
	 * */
	public void addCookies(int sleepTime) {
		pause(sleepTime);
		Set<Cookie> cookies = driver.manage().getCookies();
		for (Cookie c : cookies) {
			System.out.println(c.getName() + "->" + c.getValue());
			if (c.getName().equals("logisticSessionid")) {
				Cookie cook = new Cookie(c.getName(), c.getValue());
				driver.manage().addCookie(cook);
				System.out.println(c.getName() + "->" + c.getValue());
				System.out.println("添加成功");
			} else {
				System.out.println("没有找到logisticSessionid");
			}

		}

	}

	/** 获得CSS value */
	public String getCSSValue(WebElement e, String key) {

		return e.getCssValue(key);
	}

	/** 使用testng的assetTrue方法 */
	public void assertTrue(WebElement e, String content) {
		String str = e.getText();
		Assert.assertTrue(str.contains(content), "字符串数组中不含有：" + content);

	}

	/** 跳出frame */
	public void outFrame() {

		driver.switchTo().defaultContent();
	}

	// webdriver中可以设置很多的超时时间
	/** implicitlyWait。识别对象时的超时时间。过了这个时间如果对象还没找到的话就会抛出NoSuchElement异常 */
	public void implicitlyWait(int timeOut) {
		driver.manage().timeouts().implicitlyWait(timeOut, TimeUnit.SECONDS);
	}

	/** setScriptTimeout。异步脚本的超时时间。webdriver可以异步执行脚本，这个是设置异步执行脚本脚本返回结果的超时时间 */
	public void setScriptTimeout(int timeOut) {
		driver.manage().timeouts().setScriptTimeout(timeOut, TimeUnit.SECONDS);
	}

	/**
	 * pageLoadTimeout。页面加载时的超时时间。因为webdriver会等页面加载完毕在进行后面的操作，
	 * 所以如果页面在这个超时时间内没有加载完成，那么webdriver就会抛出异常
	 */

	public void waitForPageLoading(int pageLoadTime) {
		driver.manage().timeouts().pageLoadTimeout(pageLoadTime, TimeUnit.SECONDS);

	}

	/** 根据元素来获取此元素的定位值 */
	public String getLocatorByElement(WebElement element, String expectText) {
		String text = element.toString();
		String expect = null;
		try {
			expect = text.substring(text.indexOf(expectText) + 1, text.length() - 1);
		} catch (Exception e) {
			e.printStackTrace();
			logger.error("failed to find the string [" + expectText + "]");

		}

		return expect;

	}
	/**
	 * 获取当前页面的URL
	 * */
	public String getPageURL(){
		return driver.getCurrentUrl();

	}
	/**
	 * 这是一堆相同的elements中 选择 其中方的 一个 然后在这个选定的中 继续定位
	 * */
	public WebElement getOneElement(By bys, By by, int index) {
		return findElementsBy(bys).get(index).findElement(by);
	}

	/**
	 * 上传文件，需要点击弹出上传照片的窗口才行
	 *
	 * @param brower
	 *            使用的浏览器名称
	 * @param file
	 *            需要上传的文件及文件名
	 */
	public void handleUpload(String browser, File file) {
		String filePath = file.getAbsolutePath();
		String executeFile = "res/script/autoit/Upload.exe";
		String cmd = "\"" + executeFile + "\"" + " " + "\"" + browser + "\"" + " " + "\"" + filePath + "\"";
		try {
			Process p = Runtime.getRuntime().exec(cmd);
			p.waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


	/**
	 * @Description 对于windows GUI弹出框，要求输入用户名和密码时，
	 *              seleniumm不能直接操作，需要借助http://modifyusername:modifypassword@yoururl 这种方法
	 *
	 * */
	public void loginOnWinGUI(String username, String password, String url) {
		driver.get(username + ":" + password + "@" + url);
	}

	/** 检查元素是否显示 */
	public boolean isDisplayed(WebElement element) {
		boolean isDisplay = false;
		if (element.isDisplayed()) {
			logger.info("The element: [" + getLocatorByElement(element, ">") + "] is displayed");
			isDisplay = true;
		} else if (element.isDisplayed() == false) {
			logger.warn("The element: [" + getLocatorByElement(element, ">") + "] is not displayed");

			isDisplay = false;
		}
		return isDisplay;
	}

	/**检查元素是不是存在*/
	public  boolean doesElementsExist(By byElement){
		try{
		findElementBy(byElement);
		return true;
		}catch(NoSuchElementException nee){

			return false;
		}


	}

	/** 
	 * 树状的checkbox
	 *
	 * 操作元素进行是否勾选
	 * flag:OFF,ON
	 *  */
	public void CheckBoxSelectedTree(By byElement, String value, String flag) {
		try {
			String xpathvalue = byElement.toString().split("xpath:")[1].trim() + "//span[text()='" + value
					+ "']/../preceding-sibling::*[1]";
			//等待选择元素的加载
			for(int i = 0; i < 5 ; i++){
				if(findElementBy(byElement).getText().equals("")){
					waitMilliSecond(1000);
				}else{
					break;
				}
			}
			WebElement element = findElementBy(By.xpath(xpathvalue));
			if (flag.toLowerCase().equals("on")) {
				if (element.getAttribute("class").contains("true_full")) {
					logger.info("The element: [" + getLocatorByElement(element, ">") + "] is selected");
					return;
				} else if (element.getAttribute("class").contains("false_full")) {
					element.click();
					loadPage();
					logger.info("The element: [" + getLocatorByElement(element, ">") + "] is selected");
					return;
				}
			} else if (flag.toLowerCase().equals("off")) {
				if (element.getAttribute("class").contains("true_full")) {
					element.click();
					loadPage();
					logger.info("The element: [" + getLocatorByElement(element, ">") + "] is not selected");
					return;
				} else if (element.getAttribute("class").contains("false_full")) {
					logger.info("The element: [" + getLocatorByElement(element, ">") + "] is not selected");
					return;
				}
			}
		} catch (NoSuchElementException e) {
			logger.error("没有[" + value + "]选项..");
			Assert.fail("没有勾选[" + value + "]选项..");
		}
	}
	
	/**
	 * 链状的checkbox
	 * 操作元素进行是否勾选
	 * flag:OFF,ON
	 */

	public void CheckboxSelectList(By byElement, String value, String flag){
		String xpathvalue = byElement.toString().split("xpath:")[1].trim() + "//span[contains(text(),'"+ value +"')]/preceding-sibling::*[1]";
		WebElement element = findElementBy(By.xpath(xpathvalue));
		if (flag.toLowerCase().equals("on")) {
			if (element.getAttribute("class").contains("is-checked")) {
				logger.info("The element: [" + getLocatorByElement(element, ">") + "] is selected");
			} else {
				element.click();
				loadPage();
				logger.info("The element: [" + getLocatorByElement(element, ">") + "] is selected");
			}
		} else if (flag.toLowerCase().equals("off")) {
			if (element.getAttribute("class").contains("is-checked")) {
				element.click();
				loadPage();
				logger.info("The element: [" + getLocatorByElement(element, ">") + "] is not selected");
			} else{
				logger.info("The element: [" + getLocatorByElement(element, ">") + "] is not selected");
			}
		}
		
	}
	
	/**
	 * 判断实际文本时候包含期望文本
	 *
	 * @param actual
	 *            实际文本
	 * @param expect
	 *            期望文本
	 */
	public void isContains(String actual, String expect) {
		try {
			Assert.assertTrue(actual.contains(expect));
		} catch (AssertionError e) {
			logger.error("The [" + actual + "] is not contains [" + expect + "]");
			Assert.fail("The [" + actual + "] is not contains [" + expect + "]");
		}
		logger.info("The [" + actual + "] is contains [" + expect + "]");
	}

	/**
	 * 判断实际文本,不包含期望文本
	 *
	 * @param actual
	 *            实际文本
	 * @param expect
	 *            期望文本
	 */
	public void isNotContains(String actual, String expect) {
		try {
			Assert.assertFalse(actual.contains(expect));
		} catch (AssertionError e) {
			logger.error("The [" + actual + "] is  contains [" + expect + "]");
			Assert.fail("The [" + actual + "] is  contains [" + expect + "]");
		}
		logger.info("The [" + actual + "] is not contains [" + expect + "]");
	}

	/** 获得屏幕的分辨率 - 宽 */
	public  double getScreenWidth() {
		return java.awt.Toolkit.getDefaultToolkit().getScreenSize().getWidth();
	}

	/**进入新窗口*/
	public void switchNewWindow(By byElement){
		//获取当前页面句柄
		 current_handles = driver.getWindowHandle();
		//点击某个链接会弹出一个新窗口
		click(byElement);
		//接下来会有新的窗口打开，获取所有窗口句柄
		Set<String> all_handles = driver.getWindowHandles();
		//循环判断，把当前句柄从所有句柄中移除，剩下的就是你想要的新窗口
		Iterator<String> it = all_handles.iterator();
		while(it.hasNext()){
		if(current_handles == it.next()) continue;
		//跳入新窗口,并获得新窗口的driver - newWindow
		 window = driver.switchTo().window(it.next());
		}

	}

	/**回到原始窗口*/
	public void backToOriginalWindow(){
		//window.close();
		driver.switchTo().window(current_handles);

	}

	/**停止页面加载*/
	public void stopLoad(){
		pause(1);
		Robot r;
		try {
			r = new Robot();
			r.keyPress(KeyEvent.VK_ESCAPE);
			logger.info("按下了Esc键");
			r.keyRelease(KeyEvent.VK_ESCAPE);
			logger.info("松开了Esc键");
		} catch (AWTException e) {
			e.printStackTrace();
		}

		logger.info("正在停止页面加载...");
	}

	/**获取系统时间*/
	public int getDate(String getOption){
		 Calendar a=Calendar.getInstance();
		 int result=0;
		switch(getOption.toLowerCase().charAt(0)){

		case 'y':
			result = a.get(Calendar.YEAR);
			break;
		case 'm':
			result = a.get(Calendar.MONTH)+1;
			break;
		case 'd':
			result = a.get(Calendar.DATE);
			break;
			default:
				Assert.fail("只支持输入year、month、day。你输入了："+getOption);

		}

		return result;
	}
	/**判断alert是否出现*/
	public boolean isAlertPresent(){
        try
        {
            driver.switchTo().alert();
            logger.info("alert出现");
            return true;
        }
        catch (NoAlertPresentException Ex)
        {
        	logger.warn("alert没有出现");
            return false;//input[@id='validateCode']
        }
}



	/**POMP管理系统登录操作*/
	public void loginPomp(String username,String password){
		type(By.xpath("//label[@for='username']//following-sibling::*[1]//input"),username);
		type(By.xpath("//label[@for='password']//following-sibling::*[1]//input"),password);
		type(By.xpath("//label[text()='验证码']/following-sibling::*[1]//input"),"9999");
	//	waitMilliSecond(10000);
		click(By.xpath("//span[text()='登录']"));
	}

	/**
	 *等待页面加载页面加载,等待时间30秒
	 */
	public void loadPage(){
		waitMilliSecond(500);
		for(int i=1;i<30;i++){
			if(driver.findElement(By.xpath("//*[@id='app']/div[@class='ake_loading']")).isDisplayed()){
				waitMilliSecond(250);
			}
			else {
				logger.info("页面加载完成");
				break;
			}
		}
	}

	/**
	 * 在多个相同元素中，定位到指定的元素
	 * @param by
	 * @param index
	 * @return
	 */
	public WebElement getOneElement(By by, int index) {
		 List<WebElement> element = driver.findElements(by);
		 return element.get(index);
	}

	/**
	 * 获取指定table某一整列的值
	 */
	public String getColumnText(By by){
		String values = null;
		List<WebElement> elements = findElementsBy(by);
		for(WebElement e: elements){
			String value = e.getText();
			if(value.length() > 0){
				values = values + "," + value;
			}
		}
		return values.replace("null,", "");
	}

	/**
	 * 获取指定table某一行的值
	 * @param index：行号，行号从1开始（0代表table的表头）
	 */
	public String getRowText(By by, int index){
		String values = null;
		List<WebElement> rows = findElementsBy(by);  //tr对象
		WebElement row = rows.get(index);
		if(row.findElements(By.tagName("td")).size()>0){
			List<WebElement> cells = row.findElements(By.tagName("td"));  //td对象
			for(WebElement cell:cells){
				String value = cell.getText();
				if(value.length() > 0){
					values = values + "," + value;
				}

			}
		}
		return values.replace("null,", "");
	}

	/**
	 * 获取指定table个单元格的值
	 * @param index：行号，行号从1开始（0代表table的表头）
	 */
	public String getCellText(By by, int RowID, int ColID){
		String value = null;
		//得到table元素对象
		WebElement table = driver.findElement(by);
		//得到table表中所有行对象，并得到所要查询的行对象。
		List<WebElement> rows = table.findElements(By.tagName("tr"));
		WebElement theRow = rows.get(RowID);
		//调用getCell方法得到对应的列对象，然后得到要查询的文本。
		value = getCell(theRow, ColID).getText();
		return value.replace("null,", "");
	}


	/**
	 *
	 * @param Row: 一行的对象
	 * @param ColID：对应列
	 * @return
	 */
	private WebElement getCell(WebElement Row,int ColID){
		List<WebElement> cells;
		WebElement target = null;
		//列里面有"<th>"、"<td>"两种标签，所以分开处理。
		if(Row.findElements(By.tagName("th")).size()>0){
		cells = Row.findElements(By.tagName("th"));
		target = cells.get(ColID);
		}
		if(Row.findElements(By.tagName("td")).size()>0){
		cells = Row.findElements(By.tagName("td"));
		target = cells.get(ColID);
		}
		return target;
	}

	/**
	 * 在给定的时间内去查找元素，如果没找到则超时，抛出异常
	 * */
	public boolean isShown(int timeOut, final By By) {
		boolean flag = true;
		logger.info("开始查找元素[" + By + "]");
		try {
			(new WebDriverWait(driver, timeOut)).until(new ExpectedCondition<Boolean>() {
				public Boolean apply(WebDriver driver) {
					WebElement element = driver.findElement(By);
					return element.isDisplayed();
				}
			});
		} catch (TimeoutException e) {
			flag = false;

		}
		return flag;
	}


	/**页面过长时候滑动页面 window.scrollTo(左边距,上边距); */
	public void scrollPage(int x,int y){
		String js ="window.scrollTo("+x+","+y+");";
	    ((JavascriptExecutor)driver).executeScript(js);
	}	
	
	/**当前页面截图; */
	public void screenShot(String founction,String caseName,String name){
		if(founction ==null){
			founction = "default";
		}
		String dir_name="result" + File.separator + "screenshot" +File.separator+ founction +File.separator+caseName;
		if (!(new File(dir_name).isDirectory())){
			new File(dir_name).mkdir();
		}

		try{
			File source_file= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(source_file,new File(dir_name + File.separator + name + ".png"));
		}catch (IOException e){
			e.printStackTrace();
		}
	}
	
	/**保存动态数据到文件方便调用; 
	 * @throws IOException */
	public  void mem(String founction,String caseName,String name,String value) throws IOException{

		String folder_dir = "data" +File.separator+ founction +File.separator+caseName;
		String file_name = File.separator+caseName+".xml";
		
		createAndUpdateXml(folder_dir,file_name,name,value);
		logger.info("数值:$"+ value +"$成功保存在"+name+"变量");
	}
	
	/**保存page页面中的值到文件方便调用; 
	 * @throws IOException */
	public  void host_mem(String founction,String caseName,By elementLocator,String name) throws IOException{

		String eleText=this.getText(elementLocator);
		
		String folder_dir = "data" +File.separator+ founction +File.separator+caseName;
		String file_name = File.separator+caseName+".xml";
		
		createAndUpdateXml(folder_dir,file_name,name,eleText);
		
		logger.info("数值:$"+ eleText +"$成功保存在"+name+"变量");
	}
	
	
	/**新建及更新xml文件 */
	public void createAndUpdateXml(String folder,String fileName,String name,String value) throws IOException {
		File file=new File(folder+fileName);
		
		if(file.exists()){
			InputStream is = new FileInputStream(file);
			xmlHander.loadXML(is);
			
			String xpath="/root/caseData[@name='" + name + "']";
			Element ele = xmlHander.visitNode(xpath).getEle();
			
			if(ele != null){
				ele.setAttributeValue("name", name);
				ele.setAttributeValue("value", value);
			}
			else{
				Element root = xmlHander.getDoc().getRootElement();
				Element sonEle= root.addElement("caseData");
				sonEle.addAttribute("name", name);
				sonEle.addAttribute("value",value);
			}
			xmlHander.outPutXMLPretty(file.getAbsolutePath(), "UTF-8");
		}
		else{
			Document dom=DocumentHelper.createDocument();
			Element root = dom.addElement("root");
			Element sonEle=root.addElement("caseData");
			sonEle.addAttribute("name", name);
			sonEle.addAttribute("value",value);
			xmlHander.setDoc(dom);
			xmlHander.outPutXMLPretty(file.getAbsolutePath(), "UTF-8");
		}
	}
	
	/**
	 * 封装的粘贴函数，将string的参数值 放到剪切版，然后再使用robot对象模拟crtl+V来实现黏贴操作
	 */
	public void setAndctrlVClipboardData(String string){
		StringSelection stringSelection = new StringSelection(string);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
		Robot robot = null;
		try {
			robot =new Robot();
		}catch(AWTException e){
			e.printStackTrace();
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
	}
	
	/**
	 * 模拟按键Ctrl+A,全选操作
	 * 
	 */
	public void pressCtrlAndA(){
		Robot robot = null;
		try{
			robot = new Robot();
		}catch(AWTException e ){
			e.printStackTrace();
		}
		try {
			Thread.sleep(250);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		robot.keyPress(KeyEvent.VK_CONTROL);
		waitMilliSecond(250);
		robot.keyPress(KeyEvent.VK_A);
		waitMilliSecond(250);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_A);
	}
	
	
	/**
	 * 模拟按键tab
	 */
	public void pressTabKey(){
		Robot robot = null;
		try{
			robot = new Robot();
		}catch(AWTException e ){
			e.printStackTrace();
		}
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
	}
	
	/**
	 * 等待元素属性值的发生变化
	 * @param by
	 * @param text
	 */
	public String waitElementAttribute(By by){
		String text = null;
		for(int i=1;i<60;i++){
			if(driver.findElement(by).isDisplayed()){
				text = driver.findElement(by).getText();
				logger.info("页面元素:["+by+"]已变化");
				break;
			}
			else {
				waitMilliSecond(250);
			}
		}
		return text;
	}
	
	public void waitMilliSecond(int num) {
		try {
			Thread.sleep(num);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 单选框，选择ul的标签
	 * @param by
	 * @param value
	 */
	public void singleChoose(By by, String value) {
		String xpathspan = by.toString().split("xpath:")[1].trim() + "//span[contains(text(),'" + value
				+ "')]/preceding-sibling::span[1]";
		WebElement b = driver.findElement(by.xpath(xpathspan));
		if (b.getAttribute("class").contains("true")) {
			logger.info("页面元素" + by + "is select");
		} else {
			b.click();
			loadPage();
			logger.info("页面元素" + by + "is select");
		}
	}
	
	/**
	 * 关闭tab交易
	 */
	public void closeAllTab(){
		click(By.xpath("//i[@class='ion-grid']"));
		waitMilliSecond(250);
		WebElement obj = driver.findElement(By.xpath("//div[@class='tab-list-wrapper scale-box']//li[contains(text(),'关闭所有标签页')]"));
		if(obj.getAttribute("class").contains("disabled")){
			click(By.xpath("//div[@class='mask-box']"));
			waitMilliSecond(250);
		}else{
			click(By.xpath("//div[@class='tab-list-wrapper scale-box']//li[contains(text(),'关闭所有标签页')]"));
			waitMilliSecond(250);
		}
	}
	
	
	/**目前pomp的table有三个，左右固定，中间可滑动
	 * by是获取table上级的div
	 */
	public void clickTableCheckbox(By by,String value){
		String xpathdiv = by.toString().split(":")[1].trim() + "//span[contains(text(),'" + value + "')]/../../..//span[@class='el-checkbox__inner']";
		WebElement b = driver.findElement(By.xpath(xpathdiv));
		waitMilliSecond(500);
		b.click();
	}
	
	/**
	 *pomp选择自然月，把可选都先上
	 */
	public void clickDateTable(By by){
		String xpathdiv = by.toString().split(":")[1].trim() + "//td[@class='month']";
		List<WebElement> b = driver.findElements(By.xpath(xpathdiv));
		for(WebElement a:b){
			waitMilliSecond(250);
			a.click();
		}
	}
	
	/**
	 * 模拟进出场; 
	 * mockType, 0:进场；1：离场
	 */
	public void passAndOut(String carNum, String mockType,String FUNCTION_NAME,String CASE_NAME) {
		switchToWindow("模拟进出场");
		type(By.xpath("//input[@name='carNo']"),carNum);
		type(By.xpath("//input[@name='mockType']"),mockType);
		findElementBy(By.xpath("//button[contains(text(),'进出场')]")).click();
		String value = null;
		for (int i = 0; i < 10; i++) {
			value = getText(By.xpath("//div[@class='data']"));
			if (value.equals("")) {
				waitMilliSecond(1000);
			}else{
				break;
			}

		}
		isTextCorrect(value, "成功");
		screenShot(FUNCTION_NAME,CASE_NAME,"0模拟进出场截图");
		logger.info(carNum + ":进出场成功");
		driver.close();
		//返回原来的窗口
		backToOriginalWindow();
	}
	
	/**
	 * 根据标题切换浏览器
	 */
	public void switchToWindow(String windowTitle){
		boolean flag = false;
	    try { 
	    	//将页面上所有的windowshandle放在入set集合当中
	        String current_handles = driver.getWindowHandle();  
	        Set<String> handles = driver.getWindowHandles();  
	        for (String s : handles) {
	            if (s.equals(current_handles))  
	                continue;  
	            else { 
	            	driver.switchTo().window(s);
	        //和当前的窗口进行比较如果相同就切换到windowhandle
	        //判断title是否和handles当前的窗口相同
	                if (driver.getTitle().contains(windowTitle)) { 
	                	flag = true;
	                    System.out.println("Switch to window: "  
	                            + windowTitle + " successfully!");  
	                    break;  
	                } else  
	                    continue;  
	            }  
	        }

	    } catch (Exception e) {  
	        System.out.printf("Window: " + windowTitle  
	                + " cound not found!", e.fillInStackTrace());  
	    }
        if(flag == false){
        	logger.info("没有【" + windowTitle + "】浏览器窗口...重新打开..");
        	executeJS("window.open('http://172.18.40.8:9009');");
        	waitMilliSecond(1000);
        	switchToWindow("模拟进出场");
        }
	}
	
	/**
	 * 缴费操作
	 */
	public void payCharge(String carNum,String parkCode,String FUNCTION_NAME,String CASE_NAME) {
		switchToWindow("模拟进出场");
		//查费操作 
		findElementBy(By.xpath("//input[@class='parkCode1']")).sendKeys(parkCode);
		findElementBy(By.xpath("//input[@class='carNo1']")).sendKeys(carNum);
		findElementBy(By.xpath("//button[contains(text(),'查 费')]")).click();
		String value = null;
		String value1 = null;
		for (int i = 1; i < 10; i++) {
			value = getText(By.xpath("//div[@class='data1']"));
			if(value.equals("")) {
				waitMilliSecond(1000);
			}else{
				break;
			}
		}
		//缴费操作
		findElementBy(By.xpath("//button[contains(text(),'缴 费')]")).click();
		for (int i = 1; i < 10; i++) {
			value1 = getText(By.xpath("//div[@class='data2']"));
			if(value1.equals("")) {
				waitMilliSecond(1000);
			}else{
				break;
			}
		}
		isTextCorrect(value1, "业务成功");
		logger.info("缴费成功");
		
		screenShot(FUNCTION_NAME,CASE_NAME,"0缴费成功截图");
		driver.close();
		//返回原来的窗口
		backToOriginalWindow();
	}
	
	/**
	 * 生成随机数
	 */
	public static String randomNum(int i){
	 	String result = "";
		for (int j=0;j<i;j++){
			int a =(int) (Math.random()*9+1);
			result+=String.valueOf(a);
		}
		return result;
	}
	
}