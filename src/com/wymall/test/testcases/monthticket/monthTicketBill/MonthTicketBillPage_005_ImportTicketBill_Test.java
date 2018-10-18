package com.wymall.test.testcases.monthticket.monthTicketBill; 
import org.testng.annotations.Test; 
import com.wymall.test.base.BaseParpare; 
 import com.wymall.test.utils.SuperAction; 
public class MonthTicketBillPage_005_ImportTicketBill_Test extends BaseParpare{ 
@Test 
 public void importTicketBill() { 
SuperAction.parseExcel("monthticket/MonthTicketBill","005_ImportTicketBill",seleniumUtil);
 }
}