package com.wymall.test.testcases.statisticalAnalysis.tollcollectorReport; 
import org.testng.annotations.Test; 
import com.wymall.test.base.BaseParpare; 
 import com.wymall.test.utils.SuperAction; 
public class TollcollectorReportPage_001_checkTollcollectorReport_Test extends BaseParpare{ 
@Test 
 public void checkTollcollectorReport() { 
SuperAction.parseExcel("statisticalAnalysis/TollcollectorReport","001_checkTollcollectorReport",seleniumUtil);
 }
}