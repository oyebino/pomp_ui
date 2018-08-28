package com.wymall.test.testcases.system.user; 
import org.testng.annotations.Test; 
import com.wymall.test.base.BaseParpare; 
 import com.wymall.test.utils.SuperAction; 
public class UserPage_004_editPassword_Test extends BaseParpare{ 
@Test 
 public void editPassword() { 
SuperAction.parseExcel("system/User","004_editPassword",seleniumUtil);
 }
}