package com.wymall.test.testcases.monthticket.waterNumInformation.vIPOperationWaterNum; 
import org.testng.annotations.Test; 
import com.wymall.test.base.BaseParpare; 
 import com.wymall.test.utils.SuperAction; 
public class VIPOperationWaterNumPage_002_exportVipOperationWaterNum_Test extends BaseParpare{ 
@Test 
 public void exportVipOperationWaterNum() { 
SuperAction.parseExcel("monthticket/waterNumInformation/VIPOperationWaterNum","002_exportVipOperationWaterNum",seleniumUtil);
 }
}