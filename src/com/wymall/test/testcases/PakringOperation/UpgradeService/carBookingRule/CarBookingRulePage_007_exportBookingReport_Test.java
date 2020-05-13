package com.wymall.test.testcases.PakringOperation.UpgradeService.carBookingRule;

import org.testng.annotations.Test;
import com.wymall.test.base.BaseParpare;
import com.wymall.test.utils.SuperAction;

public class CarBookingRulePage_007_exportBookingReport_Test extends BaseParpare {
    @Test
    public void exportBookingReport() {
        SuperAction.parseExcel("PakringOperation/UpgradeService/CarBookingRule", "007_exportBookingReport", seleniumUtil);
    }
}