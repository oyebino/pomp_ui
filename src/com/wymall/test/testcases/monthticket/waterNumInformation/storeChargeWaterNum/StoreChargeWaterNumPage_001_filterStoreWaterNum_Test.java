package com.wymall.test.testcases.monthticket.waterNumInformation.storeChargeWaterNum; 
import org.testng.annotations.Test; 
import com.wymall.test.base.BaseParpare; 
 import com.wymall.test.utils.SuperAction; 
public class StoreChargeWaterNumPage_001_filterStoreWaterNum_Test extends BaseParpare{ 
@Test 
 public void filterStoreWaterNum() { 
SuperAction.parseExcel("monthticket/waterNumInformation/StoreChargeWaterNum","001_filterStoreWaterNum",seleniumUtil);
 }
}