package com.wymall.test.testcases.monthticket.waterNumInformation.monthTicketChargeWaterNum; 
import org.testng.annotations.Test; 
import com.wymall.test.base.BaseParpare; 
 import com.wymall.test.utils.SuperAction; 
public class MonthTicketChargeWaterNumPage_002_exportChargeWaterNum_Test extends BaseParpare{ 
@Test 
 public void exportChargeWaterNum() { 
SuperAction.parseExcel("monthticket/waterNumInformation/MonthTicketChargeWaterNum","002_exportChargeWaterNum",seleniumUtil);
 }
}