package com.wymall.test.testcases.PakringOperation.UpgradeService.sell; 
import org.testng.annotations.Test; 
import com.wymall.test.base.BaseParpare; 
 import com.wymall.test.utils.SuperAction; 
public class SellPage_002_returnVoucher_Test extends BaseParpare{ 
@Test 
 public void returnVoucher() { 
SuperAction.parseExcel("PakringOperation/UpgradeService/Sell","002_returnVoucher",seleniumUtil);
 }
}