package com.wymall.test.testcases.PakringOperation.MonthTicketManage.monthTicketBill; 
import org.testng.annotations.Test; 
import com.wymall.test.base.BaseParpare; 
 import com.wymall.test.utils.SuperAction; 
public class MonthTicketBillPage_002_renewMoney_Test extends BaseParpare{ 
@Test 
 public void renewMoney() { 
SuperAction.parseExcel("PakringOperation/MonthTicketManage/MonthTicketBill","002_renewMoney",seleniumUtil);
 }
}