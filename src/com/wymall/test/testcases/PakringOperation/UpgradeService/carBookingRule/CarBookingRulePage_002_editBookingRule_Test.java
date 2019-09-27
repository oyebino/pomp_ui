package com.wymall.test.testcases.PakringOperation.UpgradeService.carBookingRule; 
import org.testng.annotations.Test; 
import com.wymall.test.base.BaseParpare; 
 import com.wymall.test.utils.SuperAction; 
public class CarBookingRulePage_002_editBookingRule_Test extends BaseParpare{ 
@Test 
 public void editBookingRule() { 
SuperAction.parseExcel("PakringOperation/UpgradeService/CarBookingRule","002_editBookingRule",seleniumUtil);
 }
}