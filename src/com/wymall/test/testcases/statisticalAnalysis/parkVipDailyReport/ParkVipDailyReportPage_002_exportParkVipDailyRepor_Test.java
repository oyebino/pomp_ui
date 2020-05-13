package com.wymall.test.testcases.statisticalAnalysis.parkVipDailyReport;

import org.testng.annotations.Test;
import com.wymall.test.base.BaseParpare;
import com.wymall.test.utils.SuperAction;

public class ParkVipDailyReportPage_002_exportParkVipDailyRepor_Test extends BaseParpare {
    @Test
    public void exportParkVipDailyRepor() {
        SuperAction.parseExcel("statisticalAnalysis/ParkVipDailyReport", "002_exportParkVipDailyRepor", seleniumUtil);
    }
}