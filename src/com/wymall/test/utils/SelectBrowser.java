package com.wymall.test.utils;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.ITestContext;

/**
 * @author eason.sun
 * @decription 在不同的平台上选择对应的浏览器, 系统平台程序自动判断是什么平台
 */
public class SelectBrowser {
    static Logger logger = Logger.getLogger(SelectBrowser.class.getName());

    public WebDriver selectExplorerByName(String browser, ITestContext context) {
        //从testNG的配置文件读取管理端url
        Boolean flat = Boolean.parseBoolean(context.getCurrentXmlTest().getParameter("SeleniumGrid"));
        String hubUrl = context.getCurrentXmlTest().getParameter("hubUrl");

        Properties props = System.getProperties(); // 获得系统属性集
        String currentPlatform = props.getProperty("os.name"); // 操作系统名称
        // 从testNG的配置文件读取参数driverConfgFilePath的值
        String driverConfgFilePath = context.getCurrentXmlTest().getParameter("driverConfgFilePath");
        /** 声明好驱动的路径 */
        String chromedriver_win = PropertiesDataProvider.getTestData(driverConfgFilePath, "chromedriver_win");
        String chromedriver_linux = PropertiesDataProvider.getTestData(driverConfgFilePath, "chromedriver_win");
        String chromedriver_mac = PropertiesDataProvider.getTestData(driverConfgFilePath, "chromedriver_mac");
        String ghostdriver_win = PropertiesDataProvider.getTestData(driverConfgFilePath, "ghostdriver_win");
        String iedriver = PropertiesDataProvider.getTestData(driverConfgFilePath, "iedriver");

        logger.info("当前操作系统是:[" + currentPlatform + "]");
        logger.info("启动测试浏览器：[" + browser + "]");
        if (currentPlatform.toLowerCase().contains("win")) { // 如果是windows平台

            if (browser.equalsIgnoreCase("ie")) {
                // 返回ie浏览器对象
                return getIEDriver(iedriver);

            } else if (browser.equalsIgnoreCase("chrome")) {
                // 返回谷歌浏览器对象
                return getChromeDriver(chromedriver_win, hubUrl, flat);

            } else if (browser.equalsIgnoreCase("firefox")) {
                // 返回火狐浏览器对象
                //return new FirefoxDriver();
                return getFirefoxDriver(hubUrl, flat);

            } else if (browser.equalsIgnoreCase("ghost")) {
                // 返回ghost对象
                return getGhostDriver(ghostdriver_win);

            } else {
                logger.error(
                        "The [" + browser + "]" + " explorer is not applicable  for  [" + currentPlatform + "] OS");
                Assert.fail("The [" + browser + "]" + " explorer does not apply to  [" + currentPlatform + "] OS");
            }

        } else if (currentPlatform.toLowerCase().contains("linux")) { // 如果是linux平台

            if (browser.equalsIgnoreCase("chrome")) {
                //return getChromeDriver(chromedriver_linux,hubUrl,flat);
                return getChromeDriver(chromedriver_win, hubUrl, flat);

            } else if (browser.equalsIgnoreCase("firefox")) {
                return new FirefoxDriver();
            } else {
                logger.error("The [" + browser + "]" + " explorer does not apply to  [" + currentPlatform + "] OS");
                Assert.fail("The [" + browser + "]" + " explorer does not apply to  [" + currentPlatform + "] OS");
            }

        } else if (currentPlatform.toLowerCase().contains("mac")) { // 如果是mac平台
            if (browser.equalsIgnoreCase("chrome")) {
                return getChromeDriver(chromedriver_mac, hubUrl, flat);

            } else if (browser.equalsIgnoreCase("firefox")) {
                return new FirefoxDriver();

            } else {
                logger.error("The [" + browser + "]" + " explorer does not apply to  [" + currentPlatform + "] OS");
                Assert.fail("The [" + browser + "]" + " explorer does not apply to  [" + currentPlatform + "] OS");
            }

        } else
            logger.error("The [" + currentPlatform
                    + "] is not supported for this automation frame,please change the OS(Windows,MAC or LINUX)");

        Assert.fail("The [" + currentPlatform
                + "] is not supported for this automation frame,please change the OS(Windows,MAC or LINUX)");
        return null;
    }

    /*
     * 返回ie的driver
     */
    public WebDriver getIEDriver(String driverPath) {
        System.setProperty("webdriver.ie.driver", driverPath);
        // IE的常规设置，便于执行自动化测试
        DesiredCapabilities ieCapabilities = DesiredCapabilities.internetExplorer();
        ieCapabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
        // 返回ie浏览器对象
        return new InternetExplorerDriver(ieCapabilities);
    }

    /*
     * 返回chrome的driver
     */
    public WebDriver getChromeDriver(String driverPath, String hubUrl, Boolean flat) {
        /*
         * 浏览器设置 ChromeOptions options = new ChromeOptions();
         * options.addArguments("user-data-dir=C:"+File.separator+"Users"+File.
         * separator+"ake"+File.separator+"AppData"+File.separator+"Local"+File.
         * separator+"Google"+File.separator+"Chrome"+File.separator+"User Data"
         * );
         */
        if (flat) {
            DesiredCapabilities capability = new DesiredCapabilities();
            capability.setBrowserName("chrome");
            capability.setPlatform(Platform.WINDOWS);
            try {
                return (new RemoteWebDriver(new URL(hubUrl + "/wd/hub"), capability));
            } catch (MalformedURLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
                logger.error("浏览器driver获取异常...");
                return null;
            }
        } else {
            System.setProperty("webdriver.chrome.driver", driverPath);
            return new ChromeDriver();
        }

    }

    /*
     * 返回Ghost的driver
     */
    public WebDriver getGhostDriver(String driverPath) {
        DesiredCapabilities ghostCapabilities = new DesiredCapabilities();
        ghostCapabilities.setJavascriptEnabled(true);
        ghostCapabilities.setCapability(PhantomJSDriverService.PHANTOMJS_EXECUTABLE_PATH_PROPERTY, driverPath);
        // 返回ghost对象
        return new PhantomJSDriver(ghostCapabilities);
    }

    /*
     * 返回firefox的driver
     */
    public WebDriver getFirefoxDriver(String hubUrl, Boolean flat) {
        if (flat) {
            DesiredCapabilities capabilities = DesiredCapabilities.firefox();
            try {
                return (new RemoteWebDriver(new URL(hubUrl + "/wd/hub"), capabilities));
            } catch (MalformedURLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
                logger.error("浏览器driver获取异常...");
                return null;
            }
        } else {
            return new FirefoxDriver();
        }
    }
}
