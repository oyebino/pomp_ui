package com.wymall.test.testcases.PakringOperation.UpgradeService.mobileUser; 
import org.testng.annotations.Test; 
import com.wymall.test.base.BaseParpare; 
 import com.wymall.test.utils.SuperAction; 
public class MobileUserPage_004_delPosUser_Test extends BaseParpare{ 
@Test 
 public void delPosUser() { 
SuperAction.parseExcel("PakringOperation/UpgradeService/MobileUser","004_delPosUser",seleniumUtil);
 }
}