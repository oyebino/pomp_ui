package com.wymall.test.testcases.system.childOperator; 
import org.testng.annotations.Test; 
import com.wymall.test.base.BaseParpare; 
 import com.wymall.test.utils.SuperAction; 
public class ChildOperatorPage_003_editOperator_Test extends BaseParpare{ 
@Test 
 public void editOperator() { 
SuperAction.parseExcel("system/ChildOperator","003_editOperator",seleniumUtil);
 }
}