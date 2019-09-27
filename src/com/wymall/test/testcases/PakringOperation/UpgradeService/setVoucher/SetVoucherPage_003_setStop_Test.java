package com.wymall.test.testcases.PakringOperation.UpgradeService.setVoucher; 
import org.testng.annotations.Test; 
import com.wymall.test.base.BaseParpare; 
 import com.wymall.test.utils.SuperAction; 
public class SetVoucherPage_003_setStop_Test extends BaseParpare{ 
@Test 
 public void setStop() { 
SuperAction.parseExcel("PakringOperation/UpgradeService/SetVoucher","003_setStop",seleniumUtil);
 }
}