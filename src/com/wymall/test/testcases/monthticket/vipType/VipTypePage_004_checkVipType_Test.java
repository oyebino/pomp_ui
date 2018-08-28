package com.wymall.test.testcases.monthticket.vipType; 
import org.testng.annotations.Test; 
import com.wymall.test.base.BaseParpare; 
 import com.wymall.test.utils.SuperAction; 
public class VipTypePage_004_checkVipType_Test extends BaseParpare{ 
@Test 
 public void checkVipType() { 
SuperAction.parseExcel("monthticket/VipType","004_checkVipType",seleniumUtil);
 }
}