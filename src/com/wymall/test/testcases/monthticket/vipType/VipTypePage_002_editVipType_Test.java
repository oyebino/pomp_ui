package com.wymall.test.testcases.monthticket.vipType; 
import org.testng.annotations.Test; 
import com.wymall.test.base.BaseParpare; 
 import com.wymall.test.utils.SuperAction; 
public class VipTypePage_002_editVipType_Test extends BaseParpare{ 
@Test 
 public void editVipType() { 
SuperAction.parseExcel("monthticket/VipType","002_editVipType",seleniumUtil);
 }
}