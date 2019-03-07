package com.wymall.test.testcases.PakringOperation.UpgradeService.setVoucher; 
import org.testng.annotations.Test; 
import com.wymall.test.base.BaseParpare; 
 import com.wymall.test.utils.SuperAction; 
public class SetVoucherPage_004_setStratup_Test extends BaseParpare{ 
@Test 
 public void setStratup() { 
SuperAction.parseExcel("PakringOperation/UpgradeService/SetVoucher","004_setStratup",seleniumUtil);
 }
}