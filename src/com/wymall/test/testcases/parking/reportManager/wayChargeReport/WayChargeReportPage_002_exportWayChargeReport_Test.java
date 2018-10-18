package com.wymall.test.testcases.parking.reportManager.wayChargeReport; 
import org.testng.annotations.Test; 
import com.wymall.test.base.BaseParpare; 
 import com.wymall.test.utils.SuperAction; 
public class WayChargeReportPage_002_exportWayChargeReport_Test extends BaseParpare{ 
@Test 
 public void exportWayChargeReport() { 
SuperAction.parseExcel("parking/reportManager/WayChargeReport","002_exportWayChargeReport",seleniumUtil);
 }
}