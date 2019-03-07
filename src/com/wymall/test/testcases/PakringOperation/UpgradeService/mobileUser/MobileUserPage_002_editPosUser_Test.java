package com.wymall.test.testcases.PakringOperation.UpgradeService.mobileUser; 
import org.testng.annotations.Test; 
import com.wymall.test.base.BaseParpare; 
 import com.wymall.test.utils.SuperAction; 
public class MobileUserPage_002_editPosUser_Test extends BaseParpare{ 
@Test 
 public void editPosUser() { 
SuperAction.parseExcel("PakringOperation/UpgradeService/MobileUser","002_editPosUser",seleniumUtil);
 }
}