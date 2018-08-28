package com.wymall.test.testcases.system.childOperator; 
import org.testng.annotations.Test; 
import com.wymall.test.base.BaseParpare; 
 import com.wymall.test.utils.SuperAction; 
public class ChildOperatorPage_008_delOperator_Test extends BaseParpare{ 
@Test 
 public void delOperator() { 
SuperAction.parseExcel("system/ChildOperator","008_delOperator",seleniumUtil);
 }
}