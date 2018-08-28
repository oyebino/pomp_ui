package com.wymall.test.testcases.monthticket.monthTicketBill; 
import org.testng.annotations.Test; 
import com.wymall.test.base.BaseParpare; 
 import com.wymall.test.utils.SuperAction; 
public class MonthTicketBillPage_002_renewMoney_Test extends BaseParpare{ 
@Test 
 public void renewMoney() { 
SuperAction.parseExcel("monthticket/MonthTicketBill","002_renewMoney",seleniumUtil);
 }
}