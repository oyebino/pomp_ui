package com.wymall.test.testcases.PakringOperation.UpgradeService.cendutySeat; 
import org.testng.annotations.Test; 
import com.wymall.test.base.BaseParpare; 
 import com.wymall.test.utils.SuperAction; 
public class CendutySeatPage_005_delCenduty_Test extends BaseParpare{ 
@Test 
 public void delCenduty() { 
SuperAction.parseExcel("PakringOperation/UpgradeService/CendutySeat","005_delCenduty",seleniumUtil);
 }
}