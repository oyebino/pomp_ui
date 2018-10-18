package com.wymall.test.testcases.preferential.waterInformation; 
import org.testng.annotations.Test; 
import com.wymall.test.base.BaseParpare; 
 import com.wymall.test.utils.SuperAction; 
public class WaterInformationPage_003_exportPayVoucherWaterNum_Test extends BaseParpare{ 
@Test 
 public void exportPayVoucherWaterNum() { 
SuperAction.parseExcel("preferential/WaterInformation","003_exportPayVoucherWaterNum",seleniumUtil);
 }
}