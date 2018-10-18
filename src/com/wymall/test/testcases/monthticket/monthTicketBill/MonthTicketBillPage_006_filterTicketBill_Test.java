package com.wymall.test.testcases.monthticket.monthTicketBill; 
import org.testng.annotations.Test; 
import com.wymall.test.base.BaseParpare; 
 import com.wymall.test.utils.SuperAction; 
public class MonthTicketBillPage_006_filterTicketBill_Test extends BaseParpare{ 
@Test 
 public void filterTicketBill() { 
SuperAction.parseExcel("monthticket/MonthTicketBill","006_filterTicketBill",seleniumUtil);
 }
}