package com.wymall.test.testcases.parking.carInfoManager; 
import org.testng.annotations.Test; 
import com.wymall.test.base.BaseParpare; 
 import com.wymall.test.utils.SuperAction; 
public class CarInfoManagerPage_015_exportCarInfo_Test extends BaseParpare{ 
@Test 
 public void exportCarInfo() { 
SuperAction.parseExcel("parking/CarInfoManager","015_exportCarInfo",seleniumUtil);
 }
}