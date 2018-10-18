package com.wymall.test.testcases.monthticket.storeReport; 
import org.testng.annotations.Test; 
import com.wymall.test.base.BaseParpare; 
 import com.wymall.test.utils.SuperAction; 
public class StoreReportPage_002_exportStoreReport_Test extends BaseParpare{ 
@Test 
 public void exportStoreReport() { 
SuperAction.parseExcel("monthticket/StoreReport","002_exportStoreReport",seleniumUtil);
 }
}