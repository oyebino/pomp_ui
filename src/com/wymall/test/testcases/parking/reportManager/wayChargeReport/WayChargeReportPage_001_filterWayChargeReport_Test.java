package com.wymall.test.testcases.parking.reportManager.wayChargeReport; 
import org.testng.annotations.Test; 
import com.wymall.test.base.BaseParpare; 
 import com.wymall.test.utils.SuperAction; 
public class WayChargeReportPage_001_filterWayChargeReport_Test extends BaseParpare{ 
@Test 
 public void filterWayChargeReport() { 
SuperAction.parseExcel("parking/reportManager/WayChargeReport","001_filterWayChargeReport",seleniumUtil);
 }
}