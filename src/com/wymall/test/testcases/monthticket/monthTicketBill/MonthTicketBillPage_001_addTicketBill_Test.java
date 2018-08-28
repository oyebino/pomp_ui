package com.wymall.test.testcases.monthticket.monthTicketBill; 
import org.testng.annotations.Test; 
import com.wymall.test.base.BaseParpare; 
 import com.wymall.test.utils.SuperAction; 
public class MonthTicketBillPage_001_addTicketBill_Test extends BaseParpare{ 
@Test 
 public void addTicketBill() { 
SuperAction.parseExcel("monthticket/MonthTicketBill","001_addTicketBill",seleniumUtil);
 }
}