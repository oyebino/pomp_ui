package com.wymall.test.testcases.statisticalAnalysis.paymentTypeReport;

import org.testng.annotations.Test;
import com.wymall.test.base.BaseParpare;
import com.wymall.test.utils.SuperAction;

public class PaymentTypeReportPage_001_filterPaymentTypeReport_Test extends BaseParpare {
    @Test
    public void filterPaymentTypeReport() {
        SuperAction.parseExcel("statisticalAnalysis/PaymentTypeReport", "001_filterPaymentTypeReport", seleniumUtil);
    }
}