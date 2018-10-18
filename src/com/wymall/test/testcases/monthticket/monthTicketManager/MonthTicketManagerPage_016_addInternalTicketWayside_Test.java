package com.wymall.test.testcases.monthticket.monthTicketManager; 
import org.testng.annotations.Test; 
import com.wymall.test.base.BaseParpare; 
 import com.wymall.test.utils.SuperAction; 
public class MonthTicketManagerPage_016_addInternalTicketWayside_Test extends BaseParpare{ 
@Test 
 public void addInternalTicketWayside() { 
SuperAction.parseExcel("monthticket/MonthTicketManager","016_addInternalTicketWayside",seleniumUtil);
 }
}