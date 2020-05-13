package com.wymall.test.testcases.statisticalAnalysis.parkVipMonthIncome;

import org.testng.annotations.Test;
import com.wymall.test.base.BaseParpare;
import com.wymall.test.utils.SuperAction;

public class ParkVipMonthIncomePage_002_exportParkVipMonthIncome_Test extends BaseParpare {
    @Test
    public void exportParkVipMonthIncome() {
        SuperAction.parseExcel("statisticalAnalysis/ParkVipMonthIncome", "002_exportParkVipMonthIncome", seleniumUtil);
    }
}