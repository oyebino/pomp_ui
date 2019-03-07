package com.wymall.test.testcases.PakringOperation.UpgradeService.setVoucher; 
import org.testng.annotations.Test; 
import com.wymall.test.base.BaseParpare; 
 import com.wymall.test.utils.SuperAction; 
public class SetVoucherPage_006_delPayVoucher_Test extends BaseParpare{ 
@Test 
 public void delPayVoucher() { 
SuperAction.parseExcel("PakringOperation/UpgradeService/SetVoucher","006_delPayVoucher",seleniumUtil);
 }
}