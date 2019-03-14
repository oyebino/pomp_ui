package com.wymall.test.testcases.PakringOperation.UpgradeService.carBookingRule; 
import org.testng.annotations.Test; 
import com.wymall.test.base.BaseParpare; 
 import com.wymall.test.utils.SuperAction; 
public class CarBookingRulePage_005_checkBookingReport_Test extends BaseParpare{ 
@Test 
 public void checkBookingReport() { 
SuperAction.parseExcel("PakringOperation/UpgradeService/CarBookingRule","005_checkBookingReport",seleniumUtil);
 }
}