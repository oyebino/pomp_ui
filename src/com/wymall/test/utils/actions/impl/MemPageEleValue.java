package com.wymall.test.utils.actions.impl;

import java.io.IOException;
import java.util.Map;

import com.wymall.test.utils.SeleniumUtil;
import com.wymall.test.utils.SuperAction;
import com.wymall.test.utils.actions.ActionType;
import com.wymall.test.utils.actions.ParamConstant;

public class MemPageEleValue implements ActionType{

	@Override
	public void doAction(Map parms) {
		SeleniumUtil seleniumUtil = (SeleniumUtil) parms.get(ParamConstant.SELENIUM_UTIL);
		String varName = (String) parms.get(ParamConstant.TEST_DATA);
		String locatorType=(String) parms.get(ParamConstant.LOCATOR_TYPE);
		String locatorValue=(String) parms.get(ParamConstant.LOCATOR_VALUE);
		String founction = (String)parms.get(ParamConstant.FUNCTION_NAME);
		String caseName = (String)parms.get(ParamConstant.CASE_NAME);

		
		try {
			seleniumUtil.host_mem(founction, caseName, SuperAction.getLocateWay(locatorType, locatorValue),varName);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
