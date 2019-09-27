package com.wymall.test.testcases.PakringOperation.MonthTicketManage.monthTicketManager; 
import org.testng.annotations.Test; 
import com.wymall.test.base.BaseParpare; 
 import com.wymall.test.utils.SuperAction; 
public class MonthTicketManagerPage_002_InternalTicketUpLowerline_Test extends BaseParpare{ 
@Test 
 public void internalTicketUpLowerline() { 
SuperAction.parseExcel("PakringOperation/MonthTicketManage/MonthTicketManager","002_InternalTicketUpLowerline",seleniumUtil);
 }
}