package com.wymall.test.testcases.statisticalAnalysis.temporaryReport;

import org.testng.annotations.Test;
import com.wymall.test.base.BaseParpare;
import com.wymall.test.utils.SuperAction;

public class TemporaryReportPage_001_filterTemporaryReport_Test extends BaseParpare {
    @Test
    public void filterTemporaryReport() {
        SuperAction.parseExcel("statisticalAnalysis/TemporaryReport", "001_filterTemporaryReport", seleniumUtil);
    }
}