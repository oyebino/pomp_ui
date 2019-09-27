package com.wymall.test.testcases.PakringOperation.MonthTicketManage.monthTicketManager; 
import org.testng.annotations.Test; 
import com.wymall.test.base.BaseParpare; 
 import com.wymall.test.utils.SuperAction; 
public class MonthTicketManagerPage_017_TicketUpLowerlineWayside_Test extends BaseParpare{ 
@Test 
 public void ticketUpLowerlineWayside() { 
SuperAction.parseExcel("PakringOperation/MonthTicketManage/MonthTicketManager","017_TicketUpLowerlineWayside",seleniumUtil);
 }
}