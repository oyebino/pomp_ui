package com.wymall.test.testcases.system.childOperator; 
import org.testng.annotations.Test; 
import com.wymall.test.base.BaseParpare; 
 import com.wymall.test.utils.SuperAction; 
public class ChildOperatorPage_001_addChildOperator_Test extends BaseParpare{ 
@Test 
 public void addChildOperator() { 
SuperAction.parseExcel("system/ChildOperator","001_addChildOperator",seleniumUtil);
 }
}