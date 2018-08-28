package com.wymall.test.testcases.monthticket.vipType; 
import org.testng.annotations.Test; 
import com.wymall.test.base.BaseParpare; 
 import com.wymall.test.utils.SuperAction; 
public class VipTypePage_001_addVipType_Test extends BaseParpare{ 
@Test 
 public void addVipType() { 
SuperAction.parseExcel("monthticket/VipType","001_addVipType",seleniumUtil);
 }
}