package com.wymall.test.testcases.monthticket.monthTicketManager; 
import org.testng.annotations.Test; 
import com.wymall.test.base.BaseParpare; 
 import com.wymall.test.utils.SuperAction; 
public class MonthTicketManagerPage_015_delInternalTicketCloud_Test extends BaseParpare{ 
@Test 
 public void delInternalTicketCloud() { 
SuperAction.parseExcel("monthticket/MonthTicketManager","015_delInternalTicketCloud",seleniumUtil);
 }
}