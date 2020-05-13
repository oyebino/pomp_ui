package com.wymall.test.testcases.statisticalAnalysis.paymentReport;

import org.testng.annotations.Test;
import com.wymall.test.base.BaseParpare;
import com.wymall.test.utils.SuperAction;

public class PaymentReportPage_001_filterPaymentReport_Test extends BaseParpare {
    @Test
    public void filterPaymentReport() {
        SuperAction.parseExcel("statisticalAnalysis/PaymentReport", "001_filterPaymentReport", seleniumUtil);
    }
}