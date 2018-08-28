package com.wymall.test.testcases.monthticket.monthTicketBill; 
import org.testng.annotations.Test; 
import com.wymall.test.base.BaseParpare; 
 import com.wymall.test.utils.SuperAction; 
public class MonthTicketBillPage_003_extendTime_Test extends BaseParpare{ 
@Test 
 public void extendTime() { 
SuperAction.parseExcel("monthticket/MonthTicketBill","003_extendTime",seleniumUtil);
 }
}