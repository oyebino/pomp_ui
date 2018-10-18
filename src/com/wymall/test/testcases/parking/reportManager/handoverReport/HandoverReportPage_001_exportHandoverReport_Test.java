package com.wymall.test.testcases.parking.reportManager.handoverReport; 
import org.testng.annotations.Test; 
import com.wymall.test.base.BaseParpare; 
 import com.wymall.test.utils.SuperAction; 
public class HandoverReportPage_001_exportHandoverReport_Test extends BaseParpare{ 
@Test 
 public void exportHandoverReport() { 
SuperAction.parseExcel("parking/reportManager/HandoverReport","001_exportHandoverReport",seleniumUtil);
 }
}