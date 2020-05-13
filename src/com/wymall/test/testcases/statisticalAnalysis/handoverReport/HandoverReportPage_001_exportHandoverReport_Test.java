package com.wymall.test.testcases.statisticalAnalysis.handoverReport;

import org.testng.annotations.Test;
import com.wymall.test.base.BaseParpare;
import com.wymall.test.utils.SuperAction;

public class HandoverReportPage_001_exportHandoverReport_Test extends BaseParpare {
    @Test
    public void exportHandoverReport() {
        SuperAction.parseExcel("statisticalAnalysis/HandoverReport", "001_exportHandoverReport", seleniumUtil);
    }
}