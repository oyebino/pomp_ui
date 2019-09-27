package com.wymall.test.testcases.PakringOperation.UpgradeService.activityVoucher; 
import org.testng.annotations.Test; 
import com.wymall.test.base.BaseParpare; 
 import com.wymall.test.utils.SuperAction; 
public class ActivityVoucherPage_007_downloadQRcode_Test extends BaseParpare{ 
@Test 
 public void downloadQRcode() { 
SuperAction.parseExcel("PakringOperation/UpgradeService/ActivityVoucher","007_downloadQRcode",seleniumUtil);
 }
}