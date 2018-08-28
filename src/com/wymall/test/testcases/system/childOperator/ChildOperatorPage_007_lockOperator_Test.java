package com.wymall.test.testcases.system.childOperator; 
import org.testng.annotations.Test; 
import com.wymall.test.base.BaseParpare; 
 import com.wymall.test.utils.SuperAction; 
public class ChildOperatorPage_007_lockOperator_Test extends BaseParpare{ 
@Test 
 public void lockOperator() { 
SuperAction.parseExcel("system/ChildOperator","007_lockOperator",seleniumUtil);
 }
}