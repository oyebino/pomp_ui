package com.wymall.test.testcases.monthticket.vipType; 
import org.testng.annotations.Test; 
import com.wymall.test.base.BaseParpare; 
 import com.wymall.test.utils.SuperAction; 
public class VipTypePage_005_delVipType_Test extends BaseParpare{ 
@Test 
 public void delVipType() { 
SuperAction.parseExcel("monthticket/VipType","005_delVipType",seleniumUtil);
 }
}