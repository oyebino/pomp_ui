package com.wymall.test.testcases.monthticket.storeReport; 
import org.testng.annotations.Test; 
import com.wymall.test.base.BaseParpare; 
 import com.wymall.test.utils.SuperAction; 
public class StoreReportPage_001_filterStoreReport_Test extends BaseParpare{ 
@Test 
 public void filterStoreReport() { 
SuperAction.parseExcel("monthticket/StoreReport","001_filterStoreReport",seleniumUtil);
 }
}