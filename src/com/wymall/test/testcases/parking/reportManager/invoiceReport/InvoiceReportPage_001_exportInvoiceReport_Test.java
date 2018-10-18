package com.wymall.test.testcases.parking.reportManager.invoiceReport; 
import org.testng.annotations.Test; 
import com.wymall.test.base.BaseParpare; 
 import com.wymall.test.utils.SuperAction; 
public class InvoiceReportPage_001_exportInvoiceReport_Test extends BaseParpare{ 
@Test 
 public void exportInvoiceReport() { 
SuperAction.parseExcel("parking/reportManager/InvoiceReport","001_exportInvoiceReport",seleniumUtil);
 }
}