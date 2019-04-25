package com.wymall.test.testcases.PakringOperation.UpgradeService.carBookingRule; 
import org.testng.annotations.Test; 
import com.wymall.test.base.BaseParpare; 
 import com.wymall.test.utils.SuperAction; 
public class CarBookingRulePage_006_exportBookingWaterNum_Test extends BaseParpare{ 
@Test 
 public void exportBookingWaterNum() { 
SuperAction.parseExcel("PakringOperation/UpgradeService/CarBookingRule","006_exportBookingWaterNum",seleniumUtil);
 }
}