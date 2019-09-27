package com.wymall.test.testcases.statisticalAnalysis.handoverReport; 
import org.testng.annotations.Test; 
import com.wymall.test.base.BaseParpare; 
 import com.wymall.test.utils.SuperAction; 
public class HandoverReportPage_002_checkHandoverReport_Test extends BaseParpare{ 
@Test 
 public void checkHandoverReport() { 
SuperAction.parseExcel("statisticalAnalysis/HandoverReport","002_checkHandoverReport",seleniumUtil);
 }
}