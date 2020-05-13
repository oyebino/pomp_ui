package com.wymall.test.testcases.PakringOperation.UpgradeService.mobileUser;

import org.testng.annotations.Test;
import com.wymall.test.base.BaseParpare;
import com.wymall.test.utils.SuperAction;

public class MobileUserPage_003_setPosUserPower_Test extends BaseParpare {
    @Test
    public void setPosUserPower() {
        SuperAction.parseExcel("PakringOperation/UpgradeService/MobileUser", "003_setPosUserPower", seleniumUtil);
    }
}