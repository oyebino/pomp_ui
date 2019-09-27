package com.wymall.test.testcases.PakringOperation.UpgradeService.carBookingRule; 
import org.testng.annotations.Test; 
import com.wymall.test.base.BaseParpare; 
 import com.wymall.test.utils.SuperAction; 
public class CarBookingRulePage_001_addBookingRule_Test extends BaseParpare{ 
@Test 
 public void addBookingRule() { 
SuperAction.parseExcel("PakringOperation/UpgradeService/CarBookingRule","001_addBookingRule",seleniumUtil);
 }
}