package com.wymall.test.testcases.system.childOperator; 
import org.testng.annotations.Test; 
import com.wymall.test.base.BaseParpare; 
 import com.wymall.test.utils.SuperAction; 
public class ChildOperatorPage_002_unlockOperator_Test extends BaseParpare{ 
@Test 
 public void unlockOperator() { 
SuperAction.parseExcel("system/ChildOperator","002_unlockOperator",seleniumUtil);
 }
}