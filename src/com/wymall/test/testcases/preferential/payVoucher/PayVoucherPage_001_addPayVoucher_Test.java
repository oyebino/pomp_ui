package com.wymall.test.testcases.preferential.payVoucher; 
import org.testng.annotations.Test; 
import com.wymall.test.base.BaseParpare; 
 import com.wymall.test.utils.SuperAction; 
public class PayVoucherPage_001_addPayVoucher_Test extends BaseParpare{ 
@Test 
 public void addPayVoucher() { 
SuperAction.parseExcel("preferential/PayVoucher","001_addPayVoucher",seleniumUtil);
 }
}