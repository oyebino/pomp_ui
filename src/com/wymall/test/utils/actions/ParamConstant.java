package com.wymall.test.utils.actions;

import java.util.Map;

import org.testng.ITestContext;

/**
 * 参数常量
 *
 * @author alvis
 */
public class ParamConstant {

    /**
     * SELENIUM_UTIL 工具实例
     */
    public static final String SELENIUM_UTIL = "SELENIUM_UTIL";

    /**
     * 测试数据
     */
    public static final String TEST_DATA = "TEST_DATA";

    /**
     * 元素定位
     */
    public static final String LOCATOR_ELE = "LOCATOR_ELE";

    /**
     * 定位方式
     */
    public static final String LOCATOR_TYPE = "LOCATOR_TYPE";

    /**
     * 定位值
     */
    public static final String LOCATOR_VALUE = "LOCATOR_VALUE";

    /**
     * 模块名
     */
    public static final String FUNCTION_NAME = "FUNCTION_NAME";

    /**
     * 用例名
     */
    public static final String CASE_NAME = "CASE_NAME";

    public static Map CURR_PARAM = null;

    /**
     * 全局变量，主要用于失败截图
     */
    public static ITestContext TEST_CONTEXT = null;
}
