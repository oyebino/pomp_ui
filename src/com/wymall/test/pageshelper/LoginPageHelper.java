package com.wymall.test.pageshelper;

import org.apache.log4j.Logger;

import com.wymall.test.pages.LoginPage;
import com.wymall.test.utils.SeleniumUtil;

/**
 * @author eason.sun
 * @description 登录页面帮助类：提供在这个页面上做的操作的方法封装
 */
public class LoginPageHelper {
    //提供本类中日志输出对象
    public static Logger logger = Logger.getLogger(LoginPageHelper.class);

    /**
     * @param seleniumUtil selenium api封装引用对象
     * @param timeOut      等待元素超时的时间
     * @author eason.sun
     * @description 等待登录页面元素加载
     */
    public static void waitLoginPageLoad(SeleniumUtil seleniumUtil, int timeOut) {
        seleniumUtil.waitForElementToLoad(timeOut, LoginPage.LP_INPUT_USERNAME);
        seleniumUtil.waitForElementToLoad(timeOut, LoginPage.LP_INPUT_PASSWORD);
        seleniumUtil.waitForElementToLoad(timeOut, LoginPage.LP_BUTTON_LOGIN);
    }


    /**
     * @param seleniumUtil selenium api封装引用对象
     * @param username     email的值
     * @param password     用户密码值
     * @author eason.sun
     * @description 登录操作封装
     */
    public static void typeLoginInfo(SeleniumUtil seleniumUtil, String username, String password) {
        logger.info("开始输入登录信息");
        //清空email输入框
        seleniumUtil.clear(LoginPage.LP_INPUT_USERNAME);
        //输入邮箱到邮箱输入框
        seleniumUtil.type(LoginPage.LP_INPUT_USERNAME, username);
        //清空密码输入框
        seleniumUtil.clear(LoginPage.LP_INPUT_PASSWORD);
        //输入密码到密码输入框
        seleniumUtil.type(LoginPage.LP_INPUT_PASSWORD, password);
        logger.info("输入登录信息完毕");
        //点击登录按钮
        seleniumUtil.click(LoginPage.LP_BUTTON_LOGIN);

    }

    /**
     * @author eason.sun
     * @description 只输入用户名，没有输入密码的提示信息
     */
    public static void checkPasswordEmptyWarningInfo(SeleniumUtil seleniumUtil, String warningInfo, int timeOut) {
        logger.info("开始检查密码为空时的提示信息");
        seleniumUtil.waitForElementToLoad(timeOut, LoginPage.LP_TEXT_PASSWORDEMPTYINFO);
        seleniumUtil.isTextCorrect(seleniumUtil.getText(LoginPage.LP_TEXT_PASSWORDEMPTYINFO), warningInfo);
        logger.info("检查密码为空时的提示信息完成");
    }

}
