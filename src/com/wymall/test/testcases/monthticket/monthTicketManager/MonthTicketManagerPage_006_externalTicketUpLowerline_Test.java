package com.wymall.test.testcases.monthticket.monthTicketManager; 
import org.testng.annotations.Test; 
import com.wymall.test.base.BaseParpare; 
 import com.wymall.test.utils.SuperAction; 
public class MonthTicketManagerPage_006_externalTicketUpLowerline_Test extends BaseParpare{ 
@Test 
 public void externalTicketUpLowerline() { 
SuperAction.parseExcel("monthticket/MonthTicketManager","006_externalTicketUpLowerline",seleniumUtil);
 }
}