package com.wymall.test.testcases.statisticalAnalysis.businessmanReport;

import org.testng.annotations.Test;
import com.wymall.test.base.BaseParpare;
import com.wymall.test.utils.SuperAction;

public class BusinessmanReportPage_002_exportBusinessmanReport_Test extends BaseParpare {
    @Test
    public void exportBusinessmanReport() {
        SuperAction.parseExcel("statisticalAnalysis/BusinessmanReport", "002_exportBusinessmanReport", seleniumUtil);
    }
}