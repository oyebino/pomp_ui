package com.wymall.test.testcases.parking.reportManager.comeAndOutReport; 
import org.testng.annotations.Test; 
import com.wymall.test.base.BaseParpare; 
 import com.wymall.test.utils.SuperAction; 
public class ComeAndOutReportPage_001_filterComeAndOutReport_Test extends BaseParpare{ 
@Test 
 public void filterComeAndOutReport() { 
SuperAction.parseExcel("parking/reportManager/ComeAndOutReport","001_filterComeAndOutReport",seleniumUtil);
 }
}