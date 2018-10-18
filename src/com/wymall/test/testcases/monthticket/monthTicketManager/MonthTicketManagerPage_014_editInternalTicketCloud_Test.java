package com.wymall.test.testcases.monthticket.monthTicketManager; 
import org.testng.annotations.Test; 
import com.wymall.test.base.BaseParpare; 
 import com.wymall.test.utils.SuperAction; 
public class MonthTicketManagerPage_014_editInternalTicketCloud_Test extends BaseParpare{ 
@Test 
 public void editInternalTicketCloud() { 
SuperAction.parseExcel("monthticket/MonthTicketManager","014_editInternalTicketCloud",seleniumUtil);
 }
}