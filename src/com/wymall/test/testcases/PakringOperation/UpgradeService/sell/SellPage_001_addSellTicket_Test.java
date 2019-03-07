package com.wymall.test.testcases.PakringOperation.UpgradeService.sell; 
import org.testng.annotations.Test; 
import com.wymall.test.base.BaseParpare; 
 import com.wymall.test.utils.SuperAction; 
public class SellPage_001_addSellTicket_Test extends BaseParpare{ 
@Test 
 public void addSellTicket() { 
SuperAction.parseExcel("PakringOperation/UpgradeService/Sell","001_addSellTicket",seleniumUtil);
 }
}