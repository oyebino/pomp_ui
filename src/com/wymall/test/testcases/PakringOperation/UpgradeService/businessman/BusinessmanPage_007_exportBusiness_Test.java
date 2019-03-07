package com.wymall.test.testcases.PakringOperation.UpgradeService.businessman; 
import org.testng.annotations.Test; 
import com.wymall.test.base.BaseParpare; 
 import com.wymall.test.utils.SuperAction; 
public class BusinessmanPage_007_exportBusiness_Test extends BaseParpare{ 
@Test 
 public void exportBusiness() { 
SuperAction.parseExcel("PakringOperation/UpgradeService/Businessman","007_exportBusiness",seleniumUtil);
 }
}