package com.wymall.test.testcases.parking.reportManager.wayComeAndOutReport; 
import org.testng.annotations.Test; 
import com.wymall.test.base.BaseParpare; 
 import com.wymall.test.utils.SuperAction; 
public class WayComeAndOutReportPage_002_exportWayComeAndOutReport_Test extends BaseParpare{ 
@Test 
 public void exportWayComeAndOutReport() { 
SuperAction.parseExcel("parking/reportManager/WayComeAndOutReport","002_exportWayComeAndOutReport",seleniumUtil);
 }
}