package com.wymall.test.testcases.system.user;

import org.testng.annotations.Test;
import com.wymall.test.base.BaseParpare;
import com.wymall.test.utils.SuperAction;

public class UserPage_001_addUser_Test extends BaseParpare {
    @Test
    public void addUser() {
        SuperAction.parseExcel("system/User", "001_addUser", seleniumUtil);
    }
}