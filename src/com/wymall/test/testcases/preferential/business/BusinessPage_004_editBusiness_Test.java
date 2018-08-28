package com.wymall.test.testcases.preferential.business; 
import org.testng.annotations.Test; 
import com.wymall.test.base.BaseParpare; 
 import com.wymall.test.utils.SuperAction; 
public class BusinessPage_004_editBusiness_Test extends BaseParpare{ 
@Test 
 public void editBusiness() { 
SuperAction.parseExcel("preferential/Business","004_editBusiness",seleniumUtil);
 }
}