package com.wymall.test.testcases.statisticalAnalysis.comeAndOutReport;

import org.testng.annotations.Test;
import com.wymall.test.base.BaseParpare;
import com.wymall.test.utils.SuperAction;

public class ComeAndOutReportPage_002_exportComeAndOutReport_Test extends BaseParpare {
    @Test
    public void exportComeAndOutReport() {
        SuperAction.parseExcel("statisticalAnalysis/ComeAndOutReport", "002_exportComeAndOutReport", seleniumUtil);
    }
}