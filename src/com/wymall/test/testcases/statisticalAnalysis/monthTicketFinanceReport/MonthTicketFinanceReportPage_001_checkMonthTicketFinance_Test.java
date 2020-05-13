package com.wymall.test.testcases.statisticalAnalysis.monthTicketFinanceReport;

import org.testng.annotations.Test;
import com.wymall.test.base.BaseParpare;
import com.wymall.test.utils.SuperAction;

public class MonthTicketFinanceReportPage_001_checkMonthTicketFinance_Test extends BaseParpare {
    @Test
    public void checkMonthTicketFinance() {
        SuperAction.parseExcel("statisticalAnalysis/MonthTicketFinanceReport", "001_checkMonthTicketFinance", seleniumUtil);
    }
}