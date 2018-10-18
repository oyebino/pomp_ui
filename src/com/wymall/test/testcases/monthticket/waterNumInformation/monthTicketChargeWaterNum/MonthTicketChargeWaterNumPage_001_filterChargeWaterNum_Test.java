package com.wymall.test.testcases.monthticket.waterNumInformation.monthTicketChargeWaterNum; 
import org.testng.annotations.Test; 
import com.wymall.test.base.BaseParpare; 
 import com.wymall.test.utils.SuperAction; 
public class MonthTicketChargeWaterNumPage_001_filterChargeWaterNum_Test extends BaseParpare{ 
@Test 
 public void filterChargeWaterNum() { 
SuperAction.parseExcel("monthticket/waterNumInformation/MonthTicketChargeWaterNum","001_filterChargeWaterNum",seleniumUtil);
 }
}