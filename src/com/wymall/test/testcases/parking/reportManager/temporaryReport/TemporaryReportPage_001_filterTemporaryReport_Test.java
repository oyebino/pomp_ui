package com.wymall.test.testcases.parking.reportManager.temporaryReport; 
import org.testng.annotations.Test; 
import com.wymall.test.base.BaseParpare; 
 import com.wymall.test.utils.SuperAction; 
public class TemporaryReportPage_001_filterTemporaryReport_Test extends BaseParpare{ 
@Test 
 public void filterTemporaryReport() { 
SuperAction.parseExcel("parking/reportManager/TemporaryReport","001_filterTemporaryReport",seleniumUtil);
 }
}