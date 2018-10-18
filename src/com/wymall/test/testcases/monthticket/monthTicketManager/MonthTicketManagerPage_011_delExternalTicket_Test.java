package com.wymall.test.testcases.monthticket.monthTicketManager; 
import org.testng.annotations.Test; 
import com.wymall.test.base.BaseParpare; 
 import com.wymall.test.utils.SuperAction; 
public class MonthTicketManagerPage_011_delExternalTicket_Test extends BaseParpare{ 
@Test 
 public void delExternalTicket() { 
SuperAction.parseExcel("monthticket/MonthTicketManager","011_delExternalTicket",seleniumUtil);
 }
}