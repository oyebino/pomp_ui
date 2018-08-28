package com.wymall.test.testcases.system.miniprogram_user; 
import org.testng.annotations.Test; 
import com.wymall.test.base.BaseParpare; 
 import com.wymall.test.utils.SuperAction; 
public class Miniprogram_userPage_001_addMinProUser_Test extends BaseParpare{ 
@Test 
 public void addMinProUser() { 
SuperAction.parseExcel("system/Miniprogram_user","001_addMinProUser",seleniumUtil);
 }
}