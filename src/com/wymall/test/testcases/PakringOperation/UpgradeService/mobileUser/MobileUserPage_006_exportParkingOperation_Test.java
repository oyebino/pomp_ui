package com.wymall.test.testcases.PakringOperation.UpgradeService.mobileUser; 
import org.testng.annotations.Test; 
import com.wymall.test.base.BaseParpare; 
 import com.wymall.test.utils.SuperAction; 
public class MobileUserPage_006_exportParkingOperation_Test extends BaseParpare{ 
@Test 
 public void exportParkingOperation() { 
SuperAction.parseExcel("PakringOperation/UpgradeService/MobileUser","006_exportParkingOperation",seleniumUtil);
 }
}