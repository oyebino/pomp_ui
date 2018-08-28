package com.wymall.test.testcases.system.childOperator; 
import org.testng.annotations.Test; 
import com.wymall.test.base.BaseParpare; 
 import com.wymall.test.utils.SuperAction; 
public class ChildOperatorPage_005_bindingParking_Test extends BaseParpare{ 
@Test 
 public void bindingParking() { 
SuperAction.parseExcel("system/ChildOperator","005_bindingParking",seleniumUtil);
 }
}