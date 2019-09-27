package com.wymall.test.testcases.system.parking_group; 
import org.testng.annotations.Test; 
import com.wymall.test.base.BaseParpare; 
 import com.wymall.test.utils.SuperAction; 
public class Parking_groupPage_002_buidingParking_Test extends BaseParpare{ 
@Test 
 public void buidingParking() { 
SuperAction.parseExcel("system/Parking_group","002_buidingParking",seleniumUtil);
 }
}