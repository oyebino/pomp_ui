package com.wymall.test.testcases.preferential.business; 
import org.testng.annotations.Test; 
import com.wymall.test.base.BaseParpare; 
 import com.wymall.test.utils.SuperAction; 
public class BusinessPage_001_addBussiness_Test extends BaseParpare{ 
@Test 
 public void addBussiness() { 
SuperAction.parseExcel("preferential/Business","001_addBussiness",seleniumUtil);
 }
}