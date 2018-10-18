package com.wymall.test.testcases.parking.reportManager.tollcollectorReport; 
import org.testng.annotations.Test; 
import com.wymall.test.base.BaseParpare; 
 import com.wymall.test.utils.SuperAction; 
public class TollcollectorReportPage_001_checkInsideCar_Test extends BaseParpare{ 
@Test 
 public void checkInsideCar() { 
SuperAction.parseExcel("parking/reportManager/TollcollectorReport","001_checkInsideCar",seleniumUtil);
 }
}