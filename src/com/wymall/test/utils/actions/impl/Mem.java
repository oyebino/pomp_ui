package com.wymall.test.utils.actions.impl;

import java.io.IOException;
import java.util.Map;

import com.wymall.test.utils.SeleniumUtil;
import com.wymall.test.utils.SuperAction;
import com.wymall.test.utils.actions.ActionType;
import com.wymall.test.utils.actions.ParamConstant;

public class Mem implements ActionType {
	/**
	 * 动作：将数据赋给变量
	 */
	@Override
	public void doAction(Map parms) {
		// TODO Auto-generated method stub
		SeleniumUtil seleniumUtil = (SeleniumUtil) parms.get(ParamConstant.SELENIUM_UTIL);
		String testData = (String) parms.get(ParamConstant.TEST_DATA);
		String founction = (String)parms.get(ParamConstant.FUNCTION_NAME);
		String caseName = (String)parms.get(ParamConstant.CASE_NAME);
		String[] testSplit=testData.split(":");
		String varName=testSplit[0];
		String varValue=testSplit[1];
		
		try {
			seleniumUtil.mem(founction, caseName, varName, varValue);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
