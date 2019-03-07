package com.wymall.test.testcases.PakringOperation.UpgradeService.sell; 
import org.testng.annotations.Test; 
import com.wymall.test.base.BaseParpare; 
 import com.wymall.test.utils.SuperAction; 
public class SellPage_003_batchSellTicket_Test extends BaseParpare{ 
@Test 
 public void batchSellTicket() { 
SuperAction.parseExcel("PakringOperation/UpgradeService/Sell","003_batchSellTicket",seleniumUtil);
 }
}