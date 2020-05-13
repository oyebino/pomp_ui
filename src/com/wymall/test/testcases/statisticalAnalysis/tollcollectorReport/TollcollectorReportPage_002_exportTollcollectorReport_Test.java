package com.wymall.test.testcases.statisticalAnalysis.tollcollectorReport;

import org.testng.annotations.Test;
import com.wymall.test.base.BaseParpare;
import com.wymall.test.utils.SuperAction;

public class TollcollectorReportPage_002_exportTollcollectorReport_Test extends BaseParpare {
    @Test
    public void exportTollcollectorReport() {
        SuperAction.parseExcel("statisticalAnalysis/TollcollectorReport", "002_exportTollcollectorReport", seleniumUtil);
    }
}