package com.wymall.test.utils.actions.impl;

import java.util.Map;

import com.wymall.test.utils.SeleniumUtil;
import com.wymall.test.utils.actions.ActionType;
import com.wymall.test.utils.actions.ParamConstant;

public class SendCoupon implements ActionType {

    @Override
    public void doAction(Map parms) {
        // TODO Auto-generated method stub
        SeleniumUtil seleniumUtil = (SeleniumUtil) parms.get(ParamConstant.SELENIUM_UTIL);
        String function_name = (String) parms.get(ParamConstant.FUNCTION_NAME);
        String case_Name = (String) parms.get(ParamConstant.CASE_NAME);
        String testData = (String) parms.get(ParamConstant.TEST_DATA);

        seleniumUtil.sendCoupon(function_name, case_Name, testData);
    }

}
