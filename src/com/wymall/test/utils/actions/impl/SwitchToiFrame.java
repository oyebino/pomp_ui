package com.wymall.test.utils.actions.impl;

import java.util.Map;

import com.wymall.test.utils.SeleniumUtil;
import com.wymall.test.utils.SuperAction;
import com.wymall.test.utils.actions.ActionType;
import com.wymall.test.utils.actions.ParamConstant;

public class SwitchToiFrame implements ActionType {
	/**
	 * 动作：进入iFrame
	 * @author alvis
	 *
	 */
	@Override
	public void doAction(Map parms) {
		// TODO Auto-generated method stub
		SeleniumUtil seleniumUtil = (SeleniumUtil) parms.get(ParamConstant.SELENIUM_UTIL);
		String locatorType=(String) parms.get(ParamConstant.LOCATOR_TYPE);
		String locatorValue=(String) parms.get(ParamConstant.LOCATOR_VALUE);
		
		seleniumUtil.switchFrame(SuperAction.getLocateWay(locatorType, locatorValue));
	}

}
