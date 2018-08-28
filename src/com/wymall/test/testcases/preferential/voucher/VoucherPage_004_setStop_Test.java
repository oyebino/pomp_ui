package com.wymall.test.testcases.preferential.voucher; 
import org.testng.annotations.Test; 
import com.wymall.test.base.BaseParpare; 
 import com.wymall.test.utils.SuperAction; 
public class VoucherPage_004_setStop_Test extends BaseParpare{ 
@Test 
 public void setStop() { 
SuperAction.parseExcel("preferential/Voucher","004_setStop",seleniumUtil);
 }
}