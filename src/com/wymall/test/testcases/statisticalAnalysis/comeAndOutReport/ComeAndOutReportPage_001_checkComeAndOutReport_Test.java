package com.wymall.test.testcases.statisticalAnalysis.comeAndOutReport; 
import org.testng.annotations.Test; 
import com.wymall.test.base.BaseParpare; 
 import com.wymall.test.utils.SuperAction; 
public class ComeAndOutReportPage_001_checkComeAndOutReport_Test extends BaseParpare{ 
@Test 
 public void checkComeAndOutReport() { 
SuperAction.parseExcel("statisticalAnalysis/ComeAndOutReport","001_checkComeAndOutReport",seleniumUtil);
 }
}