package com.wymall.test.testcases.preferential.voucher; 
import org.testng.annotations.Test; 
import com.wymall.test.base.BaseParpare; 
 import com.wymall.test.utils.SuperAction; 
public class VoucherPage_005_setStratup_Test extends BaseParpare{ 
@Test 
 public void setStratup() { 
SuperAction.parseExcel("preferential/Voucher","005_setStratup",seleniumUtil);
 }
}