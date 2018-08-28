package com.wymall.test.testcases.system.role; 
import org.testng.annotations.Test; 
import com.wymall.test.base.BaseParpare; 
 import com.wymall.test.utils.SuperAction; 
public class RolePage_004_delRoleSuccess_Test extends BaseParpare{ 
@Test 
 public void delRoleSuccess() { 
SuperAction.parseExcel("system/Role","004_delRoleSuccess",seleniumUtil);
 }
}