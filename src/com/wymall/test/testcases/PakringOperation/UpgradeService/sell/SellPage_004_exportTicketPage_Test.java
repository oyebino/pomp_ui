package com.wymall.test.testcases.PakringOperation.UpgradeService.sell; 
import org.testng.annotations.Test; 
import com.wymall.test.base.BaseParpare; 
 import com.wymall.test.utils.SuperAction; 
public class SellPage_004_exportTicketPage_Test extends BaseParpare{ 
@Test 
 public void exportTicketPage() { 
SuperAction.parseExcel("PakringOperation/UpgradeService/Sell","004_exportTicketPage",seleniumUtil);
 }
}