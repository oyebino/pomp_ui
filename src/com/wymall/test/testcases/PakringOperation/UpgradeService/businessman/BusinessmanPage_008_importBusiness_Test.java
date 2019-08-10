package com.wymall.test.testcases.PakringOperation.UpgradeService.businessman; 
import org.testng.annotations.Test; 
import com.wymall.test.base.BaseParpare; 
 import com.wymall.test.utils.SuperAction; 
public class BusinessmanPage_008_importBusiness_Test extends BaseParpare{ 
@Test 
 public void importBusiness() { 
SuperAction.parseExcel("PakringOperation/UpgradeService/Businessman","008_importBusiness",seleniumUtil);
 }
}