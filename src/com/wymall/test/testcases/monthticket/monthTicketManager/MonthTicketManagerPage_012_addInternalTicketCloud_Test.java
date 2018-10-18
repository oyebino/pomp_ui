package com.wymall.test.testcases.monthticket.monthTicketManager; 
import org.testng.annotations.Test; 
import com.wymall.test.base.BaseParpare; 
 import com.wymall.test.utils.SuperAction; 
public class MonthTicketManagerPage_012_addInternalTicketCloud_Test extends BaseParpare{ 
@Test 
 public void addInternalTicketCloud() { 
SuperAction.parseExcel("monthticket/MonthTicketManager","012_addInternalTicketCloud",seleniumUtil);
 }
}