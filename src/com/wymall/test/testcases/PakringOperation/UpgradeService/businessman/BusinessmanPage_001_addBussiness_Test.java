package com.wymall.test.testcases.PakringOperation.UpgradeService.businessman; 
import org.testng.annotations.Test; 
import com.wymall.test.base.BaseParpare; 
 import com.wymall.test.utils.SuperAction; 
public class BusinessmanPage_001_addBussiness_Test extends BaseParpare{ 
@Test 
 public void addBussiness() { 
SuperAction.parseExcel("PakringOperation/UpgradeService/Businessman","001_addBussiness",seleniumUtil);
 }
}