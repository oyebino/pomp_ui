package com.wymall.test.testcases.system.user; 
import org.testng.annotations.Test; 
import com.wymall.test.base.BaseParpare; 
 import com.wymall.test.utils.SuperAction; 
public class UserPage_006_delUser_Test extends BaseParpare{ 
@Test 
 public void delUser() { 
SuperAction.parseExcel("system/User","006_delUser",seleniumUtil);
 }
}