package com.wymall.test.testcases.system.user;

import org.testng.annotations.Test;
import com.wymall.test.base.BaseParpare;
import com.wymall.test.utils.SuperAction;

public class UserPage_005_editUser_Test extends BaseParpare {
    @Test
    public void editUser() {
        SuperAction.parseExcel("system/User", "005_editUser", seleniumUtil);
    }
}