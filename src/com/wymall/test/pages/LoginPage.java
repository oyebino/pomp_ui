package com.wymall.test.pages;

import org.openqa.selenium.By;
/**
 * @author eason.sun
 * @description 登录页面元素定位声明
 * */
public class LoginPage {
	/**登录页面-用户名输入框*/
	public static final By LP_INPUT_USERNAME = By.id("operatorname");
	/**登录页面-密码输入框*/
	public static final By LP_INPUT_PASSWORD = By.id("operatorpassword");
	/**登录按钮*/
	public static final By LP_BUTTON_LOGIN = By.className("loguser_btn");
	
	/**密码为空提示语*/
	public static final By LP_TEXT_PASSWORDEMPTYINFO = By.id("msg");
	

}
