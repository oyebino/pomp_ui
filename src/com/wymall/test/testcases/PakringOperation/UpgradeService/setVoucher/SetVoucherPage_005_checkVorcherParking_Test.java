package com.wymall.test.testcases.PakringOperation.UpgradeService.setVoucher; 
import org.testng.annotations.Test; 
import com.wymall.test.base.BaseParpare; 
 import com.wymall.test.utils.SuperAction; 
public class SetVoucherPage_005_checkVorcherParking_Test extends BaseParpare{ 
@Test 
 public void checkVorcherParking() { 
SuperAction.parseExcel("PakringOperation/UpgradeService/SetVoucher","005_checkVorcherParking",seleniumUtil);
 }
}