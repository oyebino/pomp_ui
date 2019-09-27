package com.wymall.test.utils.actions.impl;

import java.io.File;
import java.util.Map;

import com.wymall.test.utils.SeleniumUtil;
import com.wymall.test.utils.actions.ActionType;
import com.wymall.test.utils.actions.ParamConstant;

public class FileUpload implements ActionType {
	/**
	 * 动作：文件上传"
	 * @author alvis
	 *
	 */
	@Override
	public void doAction(Map parms) {
		// TODO Auto-generated method stub
		SeleniumUtil seleniumUtil = (SeleniumUtil) parms.get(ParamConstant.SELENIUM_UTIL);
		String testData = (String) parms.get(ParamConstant.TEST_DATA);
		String uploadValues[] = testData.split(";");
		
		seleniumUtil.handleUpload(uploadValues[0], new File(uploadValues[1]));
	}

}
