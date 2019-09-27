package com.wymall.test.testcases.statisticalAnalysis.vipCharge; 
import org.testng.annotations.Test; 
import com.wymall.test.base.BaseParpare; 
 import com.wymall.test.utils.SuperAction; 
public class VipChargePage_001_filterVipChargeReport_Test extends BaseParpare{ 
@Test 
 public void filterVipChargeReport() { 
SuperAction.parseExcel("statisticalAnalysis/VipCharge","001_filterVipChargeReport",seleniumUtil);
 }
}