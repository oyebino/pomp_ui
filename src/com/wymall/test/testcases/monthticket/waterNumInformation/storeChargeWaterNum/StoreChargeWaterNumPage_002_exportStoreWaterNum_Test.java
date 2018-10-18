package com.wymall.test.testcases.monthticket.waterNumInformation.storeChargeWaterNum; 
import org.testng.annotations.Test; 
import com.wymall.test.base.BaseParpare; 
 import com.wymall.test.utils.SuperAction; 
public class StoreChargeWaterNumPage_002_exportStoreWaterNum_Test extends BaseParpare{ 
@Test 
 public void exportStoreWaterNum() { 
SuperAction.parseExcel("monthticket/waterNumInformation/StoreChargeWaterNum","002_exportStoreWaterNum",seleniumUtil);
 }
}