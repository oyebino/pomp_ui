package com.wymall.test.testcases.PakringOperation.MonthTicketManage.monthTicketBill; 
import org.testng.annotations.Test; 
import com.wymall.test.base.BaseParpare; 
 import com.wymall.test.utils.SuperAction; 
public class MonthTicketBillPage_007_batchRenewMoney_Test extends BaseParpare{ 
@Test 
 public void batchRenewMoney() { 
SuperAction.parseExcel("PakringOperation/MonthTicketManage/MonthTicketBill","007_batchRenewMoney",seleniumUtil);
 }
}