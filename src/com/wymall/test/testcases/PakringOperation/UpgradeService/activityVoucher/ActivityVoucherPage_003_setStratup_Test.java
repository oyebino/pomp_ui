package com.wymall.test.testcases.PakringOperation.UpgradeService.activityVoucher; 
import org.testng.annotations.Test; 
import com.wymall.test.base.BaseParpare; 
 import com.wymall.test.utils.SuperAction; 
public class ActivityVoucherPage_003_setStratup_Test extends BaseParpare{ 
@Test 
 public void setStratup() { 
SuperAction.parseExcel("PakringOperation/UpgradeService/ActivityVoucher","003_setStratup",seleniumUtil);
 }
}