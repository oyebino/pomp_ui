package com.wymall.test.testcases.preferential.businessReport; 
import org.testng.annotations.Test; 
import com.wymall.test.base.BaseParpare; 
 import com.wymall.test.utils.SuperAction; 
public class BusinessReportPage_001_exportBusinessList_Test extends BaseParpare{ 
@Test 
 public void exportBusinessList() { 
SuperAction.parseExcel("preferential/BusinessReport","001_exportBusinessList",seleniumUtil);
 }
}