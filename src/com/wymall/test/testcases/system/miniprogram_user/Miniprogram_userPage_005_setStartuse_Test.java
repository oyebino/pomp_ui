package com.wymall.test.testcases.system.miniprogram_user; 
import org.testng.annotations.Test; 
import com.wymall.test.base.BaseParpare; 
 import com.wymall.test.utils.SuperAction; 
public class Miniprogram_userPage_005_setStartuse_Test extends BaseParpare{ 
@Test 
 public void setStartuse() { 
SuperAction.parseExcel("system/Miniprogram_user","005_setStartuse",seleniumUtil);
 }
}