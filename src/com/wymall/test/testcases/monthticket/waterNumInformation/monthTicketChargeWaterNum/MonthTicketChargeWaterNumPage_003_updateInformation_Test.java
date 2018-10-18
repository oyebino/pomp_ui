package com.wymall.test.testcases.monthticket.waterNumInformation.monthTicketChargeWaterNum; 
import org.testng.annotations.Test; 
import com.wymall.test.base.BaseParpare; 
 import com.wymall.test.utils.SuperAction; 
public class MonthTicketChargeWaterNumPage_003_updateInformation_Test extends BaseParpare{ 
@Test 
 public void updateInformation() { 
SuperAction.parseExcel("monthticket/waterNumInformation/MonthTicketChargeWaterNum","003_updateInformation",seleniumUtil);
 }
}