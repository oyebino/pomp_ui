package com.wymall.test.testcases.parking.reportManager.tollcollectorReport; 
import org.testng.annotations.Test; 
import com.wymall.test.base.BaseParpare; 
 import com.wymall.test.utils.SuperAction; 
public class TollcollectorReportPage_002_checkChargeBill_Test extends BaseParpare{ 
@Test 
 public void checkChargeBill() { 
SuperAction.parseExcel("parking/reportManager/TollcollectorReport","002_checkChargeBill",seleniumUtil);
 }
}