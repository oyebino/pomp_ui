package com.wymall.test.testcases.PakringOperation.UpgradeService.cendutySeat; 
import org.testng.annotations.Test; 
import com.wymall.test.base.BaseParpare; 
 import com.wymall.test.utils.SuperAction; 
public class CendutySeatPage_001_addCenduty_Test extends BaseParpare{ 
@Test 
 public void addCenduty() { 
SuperAction.parseExcel("PakringOperation/UpgradeService/CendutySeat","001_addCenduty",seleniumUtil);
 }
}