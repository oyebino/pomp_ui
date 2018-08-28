package com.wymall.test.testcases.system.role; 
import org.testng.annotations.Test; 
import com.wymall.test.base.BaseParpare; 
 import com.wymall.test.utils.SuperAction; 
public class RolePage_002_settingRole_Test extends BaseParpare{ 
@Test 
 public void settingRole() { 
SuperAction.parseExcel("system/Role","002_settingRole",seleniumUtil);
 }
}