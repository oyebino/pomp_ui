package com.wymall.test.testcases.preferential.payVoucher; 
import org.testng.annotations.Test; 
import com.wymall.test.base.BaseParpare; 
 import com.wymall.test.utils.SuperAction; 
public class PayVoucherPage_002_editPayVoucher_Test extends BaseParpare{ 
@Test 
 public void editPayVoucher() { 
SuperAction.parseExcel("preferential/PayVoucher","002_editPayVoucher",seleniumUtil);
 }
}