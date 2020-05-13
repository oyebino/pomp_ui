package com.wymall.test.testcases.statisticalAnalysis.parkVipDailyReport;

import org.testng.annotations.Test;
import com.wymall.test.base.BaseParpare;
import com.wymall.test.utils.SuperAction;

public class ParkVipDailyReportPage_001_checkParkVipDailyRepor_Test extends BaseParpare {
    @Test
    public void checkParkVipDailyRepor() {
        SuperAction.parseExcel("statisticalAnalysis/ParkVipDailyReport", "001_checkParkVipDailyRepor", seleniumUtil);
    }
}