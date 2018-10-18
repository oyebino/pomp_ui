package com.wymall.test.testcases.parking.reportManager.temporaryReport; 
import org.testng.annotations.Test; 
import com.wymall.test.base.BaseParpare; 
 import com.wymall.test.utils.SuperAction; 
public class TemporaryReportPage_003_checkTemporaryReportDetail_Test extends BaseParpare{ 
@Test 
 public void checkTemporaryReportDetail() { 
SuperAction.parseExcel("parking/reportManager/TemporaryReport","003_checkTemporaryReportDetail",seleniumUtil);
 }
}