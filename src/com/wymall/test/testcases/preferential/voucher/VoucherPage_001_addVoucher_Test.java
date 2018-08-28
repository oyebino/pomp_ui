package com.wymall.test.testcases.preferential.voucher; 
import org.testng.annotations.Test; 
import com.wymall.test.base.BaseParpare; 
 import com.wymall.test.utils.SuperAction; 
public class VoucherPage_001_addVoucher_Test extends BaseParpare{ 
@Test 
 public void addVoucher() { 
SuperAction.parseExcel("preferential/Voucher","001_addVoucher",seleniumUtil);
 }
}