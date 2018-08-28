package com.wymall.test.testcases.system.childOperator; 
import org.testng.annotations.Test; 
import com.wymall.test.base.BaseParpare; 
 import com.wymall.test.utils.SuperAction; 
public class ChildOperatorPage_006_setPassword_Test extends BaseParpare{ 
@Test 
 public void setPassword() { 
SuperAction.parseExcel("system/ChildOperator","006_setPassword",seleniumUtil);
 }
}