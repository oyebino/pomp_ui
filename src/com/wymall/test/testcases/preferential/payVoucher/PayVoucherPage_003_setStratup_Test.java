package com.wymall.test.testcases.preferential.payVoucher; 
import org.testng.annotations.Test; 
import com.wymall.test.base.BaseParpare; 
 import com.wymall.test.utils.SuperAction; 
public class PayVoucherPage_003_setStratup_Test extends BaseParpare{ 
@Test 
 public void setStratup() { 
SuperAction.parseExcel("preferential/PayVoucher","003_setStratup",seleniumUtil);
 }
}