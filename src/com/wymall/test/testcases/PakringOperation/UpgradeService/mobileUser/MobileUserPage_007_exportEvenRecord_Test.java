package com.wymall.test.testcases.PakringOperation.UpgradeService.mobileUser;

import org.testng.annotations.Test;
import com.wymall.test.base.BaseParpare;
import com.wymall.test.utils.SuperAction;

public class MobileUserPage_007_exportEvenRecord_Test extends BaseParpare {
    @Test
    public void exportEvenRecord() {
        SuperAction.parseExcel("PakringOperation/UpgradeService/MobileUser", "007_exportEvenRecord", seleniumUtil);
    }
}