package com.wymall.test.testcases.parking.carInfoManager; 
import org.testng.annotations.Test; 
import com.wymall.test.base.BaseParpare; 
 import com.wymall.test.utils.SuperAction; 
public class CarInfoManagerPage_012_updateInformation_Test extends BaseParpare{ 
@Test 
 public void updateInformation() { 
SuperAction.parseExcel("parking/CarInfoManager","012_updateInformation",seleniumUtil);
 }
}