package com.wymall.test.testcases.preferential.voucher; 
import org.testng.annotations.Test; 
import com.wymall.test.base.BaseParpare; 
 import com.wymall.test.utils.SuperAction; 
public class VoucherPage_003_delVoucher_Test extends BaseParpare{ 
@Test 
 public void delVoucher() { 
SuperAction.parseExcel("preferential/Voucher","003_delVoucher",seleniumUtil);
 }
}