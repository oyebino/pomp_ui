package com.wymall.test.testcases.preferential.payVoucher; 
import org.testng.annotations.Test; 
import com.wymall.test.base.BaseParpare; 
 import com.wymall.test.utils.SuperAction; 
public class PayVoucherPage_006_delPayVoucher_Test extends BaseParpare{ 
@Test 
 public void delPayVoucher() { 
SuperAction.parseExcel("preferential/PayVoucher","006_delPayVoucher",seleniumUtil);
 }
}