package com.wymall.test.utils.actions.impl;

import java.util.Map;

import com.wymall.test.utils.SeleniumUtil;
import com.wymall.test.utils.actions.ActionType;
import com.wymall.test.utils.actions.ParamConstant;

public class PassAndOut implements ActionType {

	@Override
	public void doAction(Map parms) {
		// TODO Auto-generated method stub
		SeleniumUtil seleniumUtil = (SeleniumUtil) parms.get(ParamConstant.SELENIUM_UTIL);
		String function_name = (String) parms.get(ParamConstant.FUNCTION_NAME);
		String case_name =  (String) parms.get(ParamConstant.CASE_NAME);
		String testData = (String) parms.get(ParamConstant.TEST_DATA);
		String testData1 = testData.split(";")[0];
		String testData2 = testData.split(";")[1];
		
		seleniumUtil.passAndOut(testData1, testData2,function_name,case_name);
	}

}
