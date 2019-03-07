package com.wymall.test.testcases.PakringOperation.UpgradeService.activityVoucher; 
import org.testng.annotations.Test; 
import com.wymall.test.base.BaseParpare; 
 import com.wymall.test.utils.SuperAction; 
public class ActivityVoucherPage_005_filterPayVorcher_Test extends BaseParpare{ 
@Test 
 public void filterPayVorcher() { 
SuperAction.parseExcel("PakringOperation/UpgradeService/ActivityVoucher","005_filterPayVorcher",seleniumUtil);
 }
}