package com.wymall.test.testcases.monthticket.monthTicketManager; 
import org.testng.annotations.Test; 
import com.wymall.test.base.BaseParpare; 
 import com.wymall.test.utils.SuperAction; 
public class MonthTicketManagerPage_007_editExternalTicket_Test extends BaseParpare{ 
@Test 
 public void editExternalTicket() { 
SuperAction.parseExcel("monthticket/MonthTicketManager","007_editExternalTicket",seleniumUtil);
 }
}