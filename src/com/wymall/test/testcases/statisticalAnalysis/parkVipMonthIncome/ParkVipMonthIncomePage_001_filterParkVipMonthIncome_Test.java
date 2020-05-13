package com.wymall.test.testcases.statisticalAnalysis.parkVipMonthIncome;

import org.testng.annotations.Test;
import com.wymall.test.base.BaseParpare;
import com.wymall.test.utils.SuperAction;

public class ParkVipMonthIncomePage_001_filterParkVipMonthIncome_Test extends BaseParpare {
    @Test
    public void filterParkVipMonthIncome() {
        SuperAction.parseExcel("statisticalAnalysis/ParkVipMonthIncome", "001_filterParkVipMonthIncome", seleniumUtil);
    }
}