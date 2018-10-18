package com.wymall.test.testcases.preferential.payVoucher; 
import org.testng.annotations.Test; 
import com.wymall.test.base.BaseParpare; 
 import com.wymall.test.utils.SuperAction; 
public class PayVoucherPage_007_downloadQRcode_Test extends BaseParpare{ 
@Test 
 public void downloadQRcode() { 
SuperAction.parseExcel("preferential/PayVoucher","007_downloadQRcode",seleniumUtil);
 }
}