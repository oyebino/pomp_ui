package com.wymall.test.testcases.statisticalAnalysis.businessmanReport;

import org.testng.annotations.Test;
import com.wymall.test.base.BaseParpare;
import com.wymall.test.utils.SuperAction;

public class BusinessmanReportPage_001_checkBusinessmanReport_Test extends BaseParpare {
    @Test
    public void checkBusinessmanReport() {
        SuperAction.parseExcel("statisticalAnalysis/BusinessmanReport", "001_checkBusinessmanReport", seleniumUtil);
    }
}