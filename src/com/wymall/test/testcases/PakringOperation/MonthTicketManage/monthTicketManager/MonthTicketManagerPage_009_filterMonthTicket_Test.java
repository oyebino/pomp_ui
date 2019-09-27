package com.wymall.test.testcases.PakringOperation.MonthTicketManage.monthTicketManager; 
import org.testng.annotations.Test; 
import com.wymall.test.base.BaseParpare; 
 import com.wymall.test.utils.SuperAction; 
public class MonthTicketManagerPage_009_filterMonthTicket_Test extends BaseParpare{ 
@Test 
 public void filterMonthTicket() { 
SuperAction.parseExcel("PakringOperation/MonthTicketManage/MonthTicketManager","009_filterMonthTicket",seleniumUtil);
 }
}