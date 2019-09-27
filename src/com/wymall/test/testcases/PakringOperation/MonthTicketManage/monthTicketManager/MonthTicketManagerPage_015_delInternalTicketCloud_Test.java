package com.wymall.test.testcases.PakringOperation.MonthTicketManage.monthTicketManager; 
import org.testng.annotations.Test; 
import com.wymall.test.base.BaseParpare; 
 import com.wymall.test.utils.SuperAction; 
public class MonthTicketManagerPage_015_delInternalTicketCloud_Test extends BaseParpare{ 
@Test 
 public void delInternalTicketCloud() { 
SuperAction.parseExcel("PakringOperation/MonthTicketManage/MonthTicketManager","015_delInternalTicketCloud",seleniumUtil);
 }
}