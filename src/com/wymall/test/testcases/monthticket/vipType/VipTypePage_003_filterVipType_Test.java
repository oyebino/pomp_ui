package com.wymall.test.testcases.monthticket.vipType; 
import org.testng.annotations.Test; 
import com.wymall.test.base.BaseParpare; 
 import com.wymall.test.utils.SuperAction; 
public class VipTypePage_003_filterVipType_Test extends BaseParpare{ 
@Test 
 public void filterVipType() { 
SuperAction.parseExcel("monthticket/VipType","003_filterVipType",seleniumUtil);
 }
}