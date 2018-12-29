package com.wymall.test.utils.actions.impl;

import java.util.Map;

import com.wymall.test.utils.SeleniumUtil;
import com.wymall.test.utils.SuperAction;
import com.wymall.test.utils.actions.ActionType;
import com.wymall.test.utils.actions.ParamConstant;

public class CheckMenusText implements ActionType {
	/**
	 * 动作：验证首页菜单栏文本
	 * @author alvis
	 *
	 */
	@Override
	public void doAction(Map parms) {
		// TODO Auto-generated method stub
		SeleniumUtil seleniumUtil = (SeleniumUtil) parms.get(ParamConstant.SELENIUM_UTIL);
		String testData = (String) parms.get(ParamConstant.TEST_DATA);
		String locatorType=(String) parms.get(ParamConstant.LOCATOR_TYPE);
		String locatorValue=(String) parms.get(ParamConstant.LOCATOR_VALUE);
		
		String menus[] = testData.split("，");
		for (int i1 = 0; i1 < menus.length; i1++) {
			seleniumUtil.isTextCorrect(seleniumUtil.findElementsBy(SuperAction.getLocateWay(locatorType, locatorValue)).get(i1).getText().trim().toLowerCase(), menus[i1].toLowerCase());
		}
	}

}
