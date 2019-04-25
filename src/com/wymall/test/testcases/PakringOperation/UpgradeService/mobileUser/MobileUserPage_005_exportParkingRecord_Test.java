package com.wymall.test.testcases.PakringOperation.UpgradeService.mobileUser; 
import org.testng.annotations.Test; 
import com.wymall.test.base.BaseParpare; 
 import com.wymall.test.utils.SuperAction; 
public class MobileUserPage_005_exportParkingRecord_Test extends BaseParpare{ 
@Test 
 public void exportParkingRecord() { 
SuperAction.parseExcel("PakringOperation/UpgradeService/MobileUser","005_exportParkingRecord",seleniumUtil);
 }
}