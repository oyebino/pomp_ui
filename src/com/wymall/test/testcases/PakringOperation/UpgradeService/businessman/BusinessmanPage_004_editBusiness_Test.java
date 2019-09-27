package com.wymall.test.testcases.PakringOperation.UpgradeService.businessman; 
import org.testng.annotations.Test; 
import com.wymall.test.base.BaseParpare; 
 import com.wymall.test.utils.SuperAction; 
public class BusinessmanPage_004_editBusiness_Test extends BaseParpare{ 
@Test 
 public void editBusiness() { 
SuperAction.parseExcel("PakringOperation/UpgradeService/Businessman","004_editBusiness",seleniumUtil);
 }
}