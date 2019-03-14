package com.wymall.test.testcases.statisticalAnalysis.wayComeAndOutReport; 
import org.testng.annotations.Test; 
import com.wymall.test.base.BaseParpare; 
 import com.wymall.test.utils.SuperAction; 
public class WayComeAndOutReportPage_001_filterWayComeAndOutReport_Test extends BaseParpare{ 
@Test 
 public void filterWayComeAndOutReport() { 
SuperAction.parseExcel("statisticalAnalysis/WayComeAndOutReport","001_filterWayComeAndOutReport",seleniumUtil);
 }
}