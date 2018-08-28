package com.wymall.test.testcases.preferential.voucher; 
import org.testng.annotations.Test; 
import com.wymall.test.base.BaseParpare; 
 import com.wymall.test.utils.SuperAction; 
public class VoucherPage_002_editVoucher_Test extends BaseParpare{ 
@Test 
 public void editVoucher() { 
SuperAction.parseExcel("preferential/Voucher","002_editVoucher",seleniumUtil);
 }
}