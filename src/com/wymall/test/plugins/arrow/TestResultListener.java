package com.wymall.test.plugins.arrow;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.TestListenerAdapter;

import com.google.common.base.Joiner;
import com.wymall.test.utils.SeleniumUtil;
import com.wymall.test.utils.actions.ParamConstant;

import sun.misc.BASE64Encoder;

/**
 * @author netease_arrow 描述：来自网易的截图插件
 */
public class TestResultListener extends TestListenerAdapter {

    private static Logger logger = Logger.getLogger(TestResultListener.class.getName());
    protected ITestContext testContext = null; // 这里也是新加的
    String browser = null;
    SeleniumUtil seleniumutil = null;


    @Override
    public void onStart(ITestContext testContext) { // 这里也是新加的，用于对context进行统一
        this.testContext = testContext;
        browser = String.valueOf(testContext.getCurrentXmlTest().getParameter("browserName"));
        super.onStart(testContext);
    }

    @Override
    public void onTestFailure(ITestResult tr) {
        super.onTestFailure(tr);
        logger.warn(tr.getName() + " 测试用例执行失败！");
//		WebDriver webDriver = (WebDriver) testContext.getAttribute("SELENIUM_DRIVER"); // 这里就是取driver
        WebDriver webDriver = (WebDriver) ParamConstant.TEST_CONTEXT.getAttribute("SELENIUM_DRIVER"); // 这里就是取driver
        browser = String.valueOf(testContext.getCurrentXmlTest().getParameter("browserName"));
        saveScreenShot(tr, webDriver, browser);
    }

    @Override
    public void onTestSkipped(ITestResult tr) {
        super.onTestSkipped(tr);
//		WebDriver webDriver = (WebDriver) testContext.getAttribute("SELENIUM_DRIVER");
        WebDriver webDriver = (WebDriver) ParamConstant.TEST_CONTEXT.getAttribute("SELENIUM_DRIVER"); // 这里就是取driver
        logger.warn(tr.getName() + " 测试用例由于某些原因被跳过！");
        saveScreenShot(tr, webDriver, browser);

    }

    @Override
    public void onTestSuccess(ITestResult tr) {
        super.onTestSuccess(tr);
        logger.info(tr.getName() + " 测试用例执行成功！");
    }

    @Override
    public void onTestStart(ITestResult tr) {
        super.onTestStart(tr);
        logger.info(tr.getName() + " 测试用例开始执行！");
    }

    @Override
    public void onFinish(ITestContext testContext) {
        super.onFinish(testContext);

        // List of test results which we will delete later
        ArrayList<ITestResult> testsToBeRemoved = new ArrayList<ITestResult>();
        // collect all id's from passed test
        Set<Integer> passedTestIds = new HashSet<Integer>();
        for (ITestResult passedTest : testContext.getPassedTests().getAllResults()) {
            logger.info("执行成功的用例 = " + passedTest.getName());
            passedTestIds.add(getId(passedTest));
        }

        // Eliminate the repeat methods
        Set<Integer> skipTestIds = new HashSet<Integer>();
        for (ITestResult skipTest : testContext.getSkippedTests().getAllResults()) {
            logger.info("被跳过的用例 = " + skipTest.getName());
            // id = class + method + dataprovider
            int skipTestId = getId(skipTest);

            if (skipTestIds.contains(skipTestId) || passedTestIds.contains(skipTestId)) {
                testsToBeRemoved.add(skipTest);
            } else {
                skipTestIds.add(skipTestId);
            }
        }

        // Eliminate the repeat failed methods
        Set<Integer> failedTestIds = new HashSet<Integer>();
        for (ITestResult failedTest : testContext.getFailedTests().getAllResults()) {
            logger.info("执行失败的用例 = " + failedTest.getName());
            // id = class + method + dataprovider
            int failedTestId = getId(failedTest);

            // if we saw this test as a failed test before we mark as to be
            // deleted
            // or delete this failed test if there is at least one passed
            // version
            if (failedTestIds.contains(failedTestId) || passedTestIds.contains(failedTestId) || skipTestIds.contains(failedTestId)) {
                testsToBeRemoved.add(failedTest);
            } else {
                failedTestIds.add(failedTestId);
            }
        }

        // finally delete all tests that are marked
        for (Iterator<ITestResult> iterator = testContext.getFailedTests().getAllResults().iterator(); iterator.hasNext(); ) {
            ITestResult testResult = iterator.next();
            if (testsToBeRemoved.contains(testResult)) {
                logger.info("移除重复失败的用例 = " + testResult.getName());
                iterator.remove();
            }
        }

    }

    private int getId(ITestResult result) {
        int id = result.getTestClass().getName().hashCode();
        id = id + result.getMethod().getMethodName().hashCode();
        id = id + (result.getParameters() != null ? Arrays.hashCode(result.getParameters()) : 0);
        return id;
    }

    @SuppressWarnings("rawtypes")
    private void saveScreenShot(ITestResult tr, WebDriver driver, String browser) {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss");
        String mDateTime = formatter.format(new Date());
        String fileName = "运行错误" + "_" + mDateTime;
        String filePath = "";
        try {
            // 这里可以调用不同框架的截图功能
            Map curParMap = ParamConstant.CURR_PARAM;
            String founction = (String) curParMap.get(ParamConstant.FUNCTION_NAME);
            String caseName = (String) curParMap.get(ParamConstant.CASE_NAME);
            File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            filePath = "result" + File.separator + "screenshot" + File.separator + founction + File.separator + caseName + File.separator + fileName + ".jpg";
            File destFile = new File(filePath);
            FileUtils.copyFile(screenshot, destFile);
            logger.info("[" + fileName + "] 截图成功，保存在：" + "[ " + filePath + " ]");

        } catch (Exception e) {
            filePath = "[" + fileName + "]" + " ,截图失败，原因：" + e.getMessage();
            logger.error(filePath);
        }

        if (!"".equals(filePath)) {
            Reporter.setCurrentTestResult(tr);
            //Reporter.log("");
            // 把截图写入到Html报告中方便查看
            String failScreenShotFile = filePath.replaceAll("\\\\", "/");
            String failImgBase = getBase64(failScreenShotFile).replaceAll("\n", "").replaceAll("\r", "");
            //		String screenShotListfiles = getListFloderPath(filePath).replaceAll("\\\\", "/");
            String screenShotListfiles = getListFloderPath(filePath);
            Reporter.log("<img onclick=\"viewmore(event)\" data-preview=\"" + screenShotListfiles + "\" src=\"" + failImgBase + "\"/>");
        }
    }

    //获取截图文件
    public static String getListFloderPath(String path) {
        List list = new ArrayList<String>();
        File file = new File(getFloderPath(path));
        if (file.exists()) {
            File[] files = file.listFiles();
            for (File file2 : files) {
                if (file2.isFile()) {
                    //				list.add("../../" + file2.toString());
                    list.add(getBase64(file2.toString()).replaceAll("\n", "").replaceAll("\r", ""));
                }
            }
        } else {
            return "文件不存在...";
        }
        if (!list.isEmpty()) {
            return Joiner.on("%%").join(list);
        } else {
            return "没有截图文件...";
        }
    }

    //获取文件上层路径
    public static String getFloderPath(String filePath) {
        String newPath = filePath.replaceAll("\\\\", "/");
        int index = newPath.lastIndexOf('/');
        if (index != -1) {
            return newPath.substring(0, index + 1);
        }
        return newPath;
    }

    /**
     * 获取图片base64编码
     *
     * @param sysFile
     * @return
     */
    public static String getBase64(String sysFile) {
        String imgStr = "";
        try {
            File file = new File(sysFile);
            FileInputStream fis = new FileInputStream(file);
            byte[] buffer = new byte[(int) file.length()];
            int offset = 0;
            int numRead = 0;
            while (offset < buffer.length && (numRead = fis.read(buffer, offset, buffer.length - offset)) >= 0) {
                offset += numRead;
            }

            if (offset != buffer.length) {
                throw new IOException("Could not completely read file " + file.getName());
            }
            fis.close();
            BASE64Encoder encoder = new BASE64Encoder();
            imgStr = encoder.encode(buffer);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "data:image/png;base64," + imgStr;
    }
}
