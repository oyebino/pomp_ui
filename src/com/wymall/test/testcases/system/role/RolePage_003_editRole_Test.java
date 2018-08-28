package com.wymall.test.testcases.system.role; 
import org.testng.annotations.Test; 
import com.wymall.test.base.BaseParpare; 
 import com.wymall.test.utils.SuperAction; 
public class RolePage_003_editRole_Test extends BaseParpare{ 
@Test 
 public void editRole() { 
SuperAction.parseExcel("system/Role","003_editRole",seleniumUtil);
 }
}