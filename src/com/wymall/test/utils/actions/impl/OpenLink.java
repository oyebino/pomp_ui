package com.wymall.test.utils.actions.impl;

import java.util.Map;

import com.wymall.test.utils.SeleniumUtil;
import com.wymall.test.utils.actions.ActionType;
import com.wymall.test.utils.actions.ParamConstant;

/**
 * 动作："打开链接"
 *
 * @author alvis
 */
public class OpenLink implements ActionType {

    @Override
    public void doAction(Map parms) {
        SeleniumUtil seleniumUtil = (SeleniumUtil) parms.get(ParamConstant.SELENIUM_UTIL);
        String testData = (String) parms.get(ParamConstant.TEST_DATA);
        seleniumUtil.get(testData);
    }

}
