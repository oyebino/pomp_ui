package com.wymall.test.testcases.system.user; 
import org.testng.annotations.Test; 
import com.wymall.test.base.BaseParpare; 
 import com.wymall.test.utils.SuperAction; 
public class UserPage_002_setRole_Test extends BaseParpare{ 
@Test 
 public void setRole() { 
SuperAction.parseExcel("system/User","002_setRole",seleniumUtil);
 }
}