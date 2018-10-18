package com.wymall.test.utils.actions.impl;

import java.util.Map;

import org.openqa.selenium.By;

import com.wymall.test.utils.SeleniumUtil;
import com.wymall.test.utils.actions.ActionType;
import com.wymall.test.utils.actions.ParamConstant;

public class CheckCommonTableText implements ActionType{
	@Override
	public void doAction(Map parms) {
		// TODO Auto-generated method stub
		SeleniumUtil seleniumUtil = (SeleniumUtil) parms.get(ParamConstant.SELENIUM_UTIL);
		String testData = (String) parms.get(ParamConstant.TEST_DATA);
		
		seleniumUtil.isTextCorrect(seleniumUtil.getText(By.xpath("//div[@class='common-table-wrapper']")),testData);
	}
}
