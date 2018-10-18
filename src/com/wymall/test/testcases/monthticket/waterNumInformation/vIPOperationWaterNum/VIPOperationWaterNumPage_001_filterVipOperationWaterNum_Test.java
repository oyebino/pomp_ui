package com.wymall.test.testcases.monthticket.waterNumInformation.vIPOperationWaterNum; 
import org.testng.annotations.Test; 
import com.wymall.test.base.BaseParpare; 
 import com.wymall.test.utils.SuperAction; 
public class VIPOperationWaterNumPage_001_filterVipOperationWaterNum_Test extends BaseParpare{ 
@Test 
 public void filterVipOperationWaterNum() { 
SuperAction.parseExcel("monthticket/waterNumInformation/VIPOperationWaterNum","001_filterVipOperationWaterNum",seleniumUtil);
 }
}