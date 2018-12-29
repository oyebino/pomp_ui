package com.wymall.test.utils.actions.impl;

import java.io.IOException;
import java.util.Map;

import com.wymall.test.utils.SeleniumUtil;
import com.wymall.test.utils.actions.ActionType;
import com.wymall.test.utils.actions.ParamConstant;

public class CreateCarNum implements ActionType {

	@Override
	public void doAction(Map parms) {
		// TODO Auto-generated method stub
		SeleniumUtil seleniumUtil = (SeleniumUtil) parms.get(ParamConstant.SELENIUM_UTIL);
		String testData = (String) parms.get(ParamConstant.TEST_DATA);
		String founction = (String)parms.get(ParamConstant.FUNCTION_NAME);
		String caseName = (String)parms.get(ParamConstant.CASE_NAME);
		
		String carNum = "粤Z" + seleniumUtil.randomNum(5);
		
		try {
			seleniumUtil.mem(founction, caseName, testData, carNum);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
