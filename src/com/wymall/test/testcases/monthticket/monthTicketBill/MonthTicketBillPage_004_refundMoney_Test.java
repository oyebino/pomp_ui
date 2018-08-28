package com.wymall.test.testcases.monthticket.monthTicketBill; 
import org.testng.annotations.Test; 
import com.wymall.test.base.BaseParpare; 
 import com.wymall.test.utils.SuperAction; 
public class MonthTicketBillPage_004_refundMoney_Test extends BaseParpare{ 
@Test 
 public void refundMoney() { 
SuperAction.parseExcel("monthticket/MonthTicketBill","004_refundMoney",seleniumUtil);
 }
}