package com.wymall.test.utils.actions.impl;

import java.util.Map;

import com.wymall.test.utils.SeleniumUtil;
import com.wymall.test.utils.actions.ActionType;
import com.wymall.test.utils.actions.ParamConstant;

public class OutiFrame implements ActionType {
    /**
     * 动作：跳出iFrame
     *
     * @author alvis
     */
    @Override
    public void doAction(Map parms) {
        // TODO Auto-generated method stub
        SeleniumUtil seleniumUtil = (SeleniumUtil) parms.get(ParamConstant.SELENIUM_UTIL);

        seleniumUtil.outFrame();

    }

}
