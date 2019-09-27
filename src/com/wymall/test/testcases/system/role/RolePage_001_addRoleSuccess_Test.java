package com.wymall.test.testcases.system.role; 
import org.testng.annotations.Test; 
import com.wymall.test.base.BaseParpare; 
 import com.wymall.test.utils.SuperAction; 
public class RolePage_001_addRoleSuccess_Test extends BaseParpare{ 
@Test 
 public void addRoleSuccess() { 
SuperAction.parseExcel("system/Role","001_addRoleSuccess",seleniumUtil);
 }
}