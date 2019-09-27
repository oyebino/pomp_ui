package com.wymall.test.testcases.PakringOperation.MonthTicketManage.monthTicketManager; 
import org.testng.annotations.Test; 
import com.wymall.test.base.BaseParpare; 
 import com.wymall.test.utils.SuperAction; 
public class MonthTicketManagerPage_003_editInternalTicket_Test extends BaseParpare{ 
@Test 
 public void editInternalTicket() { 
SuperAction.parseExcel("PakringOperation/MonthTicketManage/MonthTicketManager","003_editInternalTicket",seleniumUtil);
 }
}