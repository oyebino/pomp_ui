package com.wymall.test.testcases.statisticalAnalysis.paymentTypeReport; 
import org.testng.annotations.Test; 
import com.wymall.test.base.BaseParpare; 
 import com.wymall.test.utils.SuperAction; 
public class PaymentTypeReportPage_003_checkPaymentType_Test extends BaseParpare{ 
@Test 
 public void checkPaymentType() { 
SuperAction.parseExcel("statisticalAnalysis/PaymentTypeReport","003_checkPaymentType",seleniumUtil);
 }
}