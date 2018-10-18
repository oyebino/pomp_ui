package com.wymall.test.testcases.parking.reportManager.paymentReport; 
import org.testng.annotations.Test; 
import com.wymall.test.base.BaseParpare; 
 import com.wymall.test.utils.SuperAction; 
public class PaymentReportPage_002_exportPaymentReport_Test extends BaseParpare{ 
@Test 
 public void exportPaymentReport() { 
SuperAction.parseExcel("parking/reportManager/PaymentReport","002_exportPaymentReport",seleniumUtil);
 }
}