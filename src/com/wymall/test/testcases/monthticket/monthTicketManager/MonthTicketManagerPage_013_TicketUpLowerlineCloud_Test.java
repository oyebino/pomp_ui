package com.wymall.test.testcases.monthticket.monthTicketManager; 
import org.testng.annotations.Test; 
import com.wymall.test.base.BaseParpare; 
 import com.wymall.test.utils.SuperAction; 
public class MonthTicketManagerPage_013_TicketUpLowerlineCloud_Test extends BaseParpare{ 
@Test 
 public void ticketUpLowerlineCloud() { 
SuperAction.parseExcel("monthticket/MonthTicketManager","013_TicketUpLowerlineCloud",seleniumUtil);
 }
}