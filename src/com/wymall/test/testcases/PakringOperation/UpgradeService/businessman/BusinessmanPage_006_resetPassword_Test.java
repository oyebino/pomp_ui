package com.wymall.test.testcases.PakringOperation.UpgradeService.businessman;

import org.testng.annotations.Test;
import com.wymall.test.base.BaseParpare;
import com.wymall.test.utils.SuperAction;

public class BusinessmanPage_006_resetPassword_Test extends BaseParpare {
    @Test
    public void resetPassword() {
        SuperAction.parseExcel("PakringOperation/UpgradeService/Businessman", "006_resetPassword", seleniumUtil);
    }
}