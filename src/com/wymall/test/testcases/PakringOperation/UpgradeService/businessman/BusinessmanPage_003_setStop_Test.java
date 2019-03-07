package com.wymall.test.testcases.PakringOperation.UpgradeService.businessman; 
import org.testng.annotations.Test; 
import com.wymall.test.base.BaseParpare; 
 import com.wymall.test.utils.SuperAction; 
public class BusinessmanPage_003_setStop_Test extends BaseParpare{ 
@Test 
 public void setStop() { 
SuperAction.parseExcel("PakringOperation/UpgradeService/Businessman","003_setStop",seleniumUtil);
 }
}