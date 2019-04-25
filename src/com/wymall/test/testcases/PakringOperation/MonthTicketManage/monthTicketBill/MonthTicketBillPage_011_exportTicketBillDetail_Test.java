package com.wymall.test.testcases.PakringOperation.MonthTicketManage.monthTicketBill; 
import org.testng.annotations.Test; 
import com.wymall.test.base.BaseParpare; 
 import com.wymall.test.utils.SuperAction; 
public class MonthTicketBillPage_011_exportTicketBillDetail_Test extends BaseParpare{ 
@Test 
 public void exportTicketBillDetail() { 
SuperAction.parseExcel("PakringOperation/MonthTicketManage/MonthTicketBill","011_exportTicketBillDetail",seleniumUtil);
 }
}