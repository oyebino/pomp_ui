package com.wymall.test.testcases.monthticket.monthTicketBill; 
import org.testng.annotations.Test; 
import com.wymall.test.base.BaseParpare; 
 import com.wymall.test.utils.SuperAction; 
public class MonthTicketBillPage_008_batchRefundMoney_Test extends BaseParpare{ 
@Test 
 public void batchRefundMoney() { 
SuperAction.parseExcel("monthticket/MonthTicketBill","008_batchRefundMoney",seleniumUtil);
 }
}