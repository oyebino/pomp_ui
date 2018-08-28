package com.wymall.test.testcases.system.childOperator; 
import org.testng.annotations.Test; 
import com.wymall.test.base.BaseParpare; 
 import com.wymall.test.utils.SuperAction; 
public class ChildOperatorPage_004_detailOperator_Test extends BaseParpare{ 
@Test 
 public void detailOperator() { 
SuperAction.parseExcel("system/ChildOperator","004_detailOperator",seleniumUtil);
 }
}