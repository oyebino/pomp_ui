package com.wymall.test.testcases.parking.reportManager.temporaryReport; 
import org.testng.annotations.Test; 
import com.wymall.test.base.BaseParpare; 
 import com.wymall.test.utils.SuperAction; 
public class TemporaryReportPage_002_exportTemporaryReport_Test extends BaseParpare{ 
@Test 
 public void exportTemporaryReport() { 
SuperAction.parseExcel("parking/reportManager/TemporaryReport","002_exportTemporaryReport",seleniumUtil);
 }
}