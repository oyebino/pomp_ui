package com.wymall.test.testcases.preferential.waterInformation; 
import org.testng.annotations.Test; 
import com.wymall.test.base.BaseParpare; 
 import com.wymall.test.utils.SuperAction; 
public class WaterInformationPage_001_exportBusinessUserWaterNum_Test extends BaseParpare{ 
@Test 
 public void exportBusinessUserWaterNum() { 
SuperAction.parseExcel("preferential/WaterInformation","001_exportBusinessUserWaterNum",seleniumUtil);
 }
}