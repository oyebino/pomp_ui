package com.wymall.test.testcases.PakringOperation.UpgradeService.mobileUser;

import org.testng.annotations.Test;
import com.wymall.test.base.BaseParpare;
import com.wymall.test.utils.SuperAction;

public class MobileUserPage_001_addPosUser_Test extends BaseParpare {
    @Test
    public void addPosUser() {
        SuperAction.parseExcel("PakringOperation/UpgradeService/MobileUser", "001_addPosUser", seleniumUtil);
    }
}