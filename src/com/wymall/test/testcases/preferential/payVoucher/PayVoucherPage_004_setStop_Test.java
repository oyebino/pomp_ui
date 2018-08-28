package com.wymall.test.testcases.preferential.payVoucher; 
import org.testng.annotations.Test; 
import com.wymall.test.base.BaseParpare; 
 import com.wymall.test.utils.SuperAction; 
public class PayVoucherPage_004_setStop_Test extends BaseParpare{ 
@Test 
 public void setStop() { 
SuperAction.parseExcel("preferential/PayVoucher","004_setStop",seleniumUtil);
 }
}