package com.wymall.test.testcases.system.user; 
import org.testng.annotations.Test; 
import com.wymall.test.base.BaseParpare; 
 import com.wymall.test.utils.SuperAction; 
public class UserPage_003_setParkingGroup_Test extends BaseParpare{ 
@Test 
 public void setParkingGroup() { 
SuperAction.parseExcel("system/User","003_setParkingGroup",seleniumUtil);
 }
}