package com.wymall.test.testcases.PakringOperation.UpgradeService.activityVoucher; 
import org.testng.annotations.Test; 
import com.wymall.test.base.BaseParpare; 
 import com.wymall.test.utils.SuperAction; 
public class ActivityVoucherPage_004_setStop_Test extends BaseParpare{ 
@Test 
 public void setStop() { 
SuperAction.parseExcel("PakringOperation/UpgradeService/ActivityVoucher","004_setStop",seleniumUtil);
 }
}