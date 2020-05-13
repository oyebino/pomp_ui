package com.wymall.test.testcases.statisticalAnalysis.paymentTypeReport;

import org.testng.annotations.Test;
import com.wymall.test.base.BaseParpare;
import com.wymall.test.utils.SuperAction;

public class PaymentTypeReportPage_002_exportPaymentTypeReport_Test extends BaseParpare {
    @Test
    public void exportPaymentTypeReport() {
        SuperAction.parseExcel("statisticalAnalysis/PaymentTypeReport", "002_exportPaymentTypeReport", seleniumUtil);
    }
}