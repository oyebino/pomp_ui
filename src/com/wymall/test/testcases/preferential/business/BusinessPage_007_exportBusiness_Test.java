package com.wymall.test.testcases.preferential.business; 
import org.testng.annotations.Test; 
import com.wymall.test.base.BaseParpare; 
 import com.wymall.test.utils.SuperAction; 
public class BusinessPage_007_exportBusiness_Test extends BaseParpare{ 
@Test 
 public void exportBusiness() { 
SuperAction.parseExcel("preferential/Business","007_exportBusiness",seleniumUtil);
 }
}