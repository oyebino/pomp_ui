package com.wymall.test.utils.actions.impl;

import java.util.Map;

import org.apache.log4j.Logger;
import org.testng.Assert;

import com.wymall.test.utils.SeleniumUtil;
import com.wymall.test.utils.SuperAction;
import com.wymall.test.utils.actions.ActionType;
import com.wymall.test.utils.actions.ParamConstant;

public class ElementAble implements ActionType {
	/**
	 * 动作：元素被启用
	 * @author alvis
	 *
	 */
	public static Logger logger = Logger.getLogger(ElementAble.class.getName());
	
	@Override
	public void doAction(Map parms) {
		// TODO Auto-generated method stub
		SeleniumUtil seleniumUtil = (SeleniumUtil) parms.get(ParamConstant.SELENIUM_UTIL);
		String locatorType=(String) parms.get(ParamConstant.LOCATOR_TYPE);
		String locatorValue=(String) parms.get(ParamConstant.LOCATOR_VALUE);
		
		if(seleniumUtil.isEnabled(SuperAction.getLocateWay(locatorType, locatorValue))){
			logger.info(SuperAction.getLocateWay(locatorType, locatorValue)+"元素被启用");
		}else{
			Assert.fail(SuperAction.getLocateWay(locatorType, locatorValue)+"：没有被启用");
		}
	}

}
