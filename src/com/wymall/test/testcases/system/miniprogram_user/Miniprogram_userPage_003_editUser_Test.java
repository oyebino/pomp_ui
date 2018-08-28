package com.wymall.test.testcases.system.miniprogram_user; 
import org.testng.annotations.Test; 
import com.wymall.test.base.BaseParpare; 
 import com.wymall.test.utils.SuperAction; 
public class Miniprogram_userPage_003_editUser_Test extends BaseParpare{ 
@Test 
 public void editUser() { 
SuperAction.parseExcel("system/Miniprogram_user","003_editUser",seleniumUtil);
 }
}