package com.wymall.test.testcases.PakringOperation.UpgradeService.mobileUser;

import org.testng.annotations.Test;
import com.wymall.test.base.BaseParpare;
import com.wymall.test.utils.SuperAction;

public class MobileUserPage_009_exportMobileReportRecord_Test extends BaseParpare {
    @Test
    public void exportMobileReportRecord() {
        SuperAction.parseExcel("PakringOperation/UpgradeService/MobileUser", "009_exportMobileReportRecord", seleniumUtil);
    }
}