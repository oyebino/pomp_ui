package com.wymall.test.testcases.preferential.waterInformation; 
import org.testng.annotations.Test; 
import com.wymall.test.base.BaseParpare; 
 import com.wymall.test.utils.SuperAction; 
public class WaterInformationPage_002_exportBusinessSendWaterNum_Test extends BaseParpare{ 
@Test 
 public void exportBusinessSendWaterNum() { 
SuperAction.parseExcel("preferential/WaterInformation","002_exportBusinessSendWaterNum",seleniumUtil);
 }
}