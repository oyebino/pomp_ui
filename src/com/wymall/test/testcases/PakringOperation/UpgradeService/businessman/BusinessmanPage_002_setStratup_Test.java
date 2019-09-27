package com.wymall.test.testcases.PakringOperation.UpgradeService.businessman; 
import org.testng.annotations.Test; 
import com.wymall.test.base.BaseParpare; 
 import com.wymall.test.utils.SuperAction; 
public class BusinessmanPage_002_setStratup_Test extends BaseParpare{ 
@Test 
 public void setStratup() { 
SuperAction.parseExcel("PakringOperation/UpgradeService/Businessman","002_setStratup",seleniumUtil);
 }
}