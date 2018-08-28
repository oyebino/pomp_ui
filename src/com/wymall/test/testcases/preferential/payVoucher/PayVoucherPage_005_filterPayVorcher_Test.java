package com.wymall.test.testcases.preferential.payVoucher; 
import org.testng.annotations.Test; 
import com.wymall.test.base.BaseParpare; 
 import com.wymall.test.utils.SuperAction; 
public class PayVoucherPage_005_filterPayVorcher_Test extends BaseParpare{ 
@Test 
 public void filterPayVorcher() { 
SuperAction.parseExcel("preferential/PayVoucher","005_filterPayVorcher",seleniumUtil);
 }
}