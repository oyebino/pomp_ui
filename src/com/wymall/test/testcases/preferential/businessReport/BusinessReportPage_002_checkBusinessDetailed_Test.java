package com.wymall.test.testcases.preferential.businessReport; 
import org.testng.annotations.Test; 
import com.wymall.test.base.BaseParpare; 
 import com.wymall.test.utils.SuperAction; 
public class BusinessReportPage_002_checkBusinessDetailed_Test extends BaseParpare{ 
@Test 
 public void checkBusinessDetailed() { 
SuperAction.parseExcel("preferential/BusinessReport","002_checkBusinessDetailed",seleniumUtil);
 }
}