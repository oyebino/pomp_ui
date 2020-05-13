package com.wymall.test.utils.actions.impl;

import java.util.Map;

import com.wymall.test.utils.SeleniumUtil;
import com.wymall.test.utils.actions.ActionType;
import com.wymall.test.utils.actions.ParamConstant;

public class ScreenShot implements ActionType {

    @Override
    public void doAction(Map parms) {
        // TODO Auto-generated method stub
        SeleniumUtil seleniumUtil = (SeleniumUtil) parms.get(ParamConstant.SELENIUM_UTIL);
        String testData = (String) parms.get(ParamConstant.TEST_DATA);
        String function = (String) parms.get(ParamConstant.FUNCTION_NAME);
        String caseName = (String) parms.get(ParamConstant.CASE_NAME);

        seleniumUtil.screenShot(function, caseName, testData);
    }

}
