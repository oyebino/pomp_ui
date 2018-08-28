package com.wymall.test.testcases.system.parking_group; 
import org.testng.annotations.Test; 
import com.wymall.test.base.BaseParpare; 
 import com.wymall.test.utils.SuperAction; 
public class Parking_groupPage_003_checkUser_Test extends BaseParpare{ 
@Test 
 public void checkUser() { 
SuperAction.parseExcel("system/Parking_group","003_checkUser",seleniumUtil);
 }
}