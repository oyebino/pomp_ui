package com.wymall.test.testcases.monthticket.monthTicketManager; 
import org.testng.annotations.Test; 
import com.wymall.test.base.BaseParpare; 
 import com.wymall.test.utils.SuperAction; 
public class MonthTicketManagerPage_009_filterMonthTicket_Test extends BaseParpare{ 
@Test 
 public void filterMonthTicket() { 
SuperAction.parseExcel("monthticket/MonthTicketManager","009_filterMonthTicket",seleniumUtil);
 }
}