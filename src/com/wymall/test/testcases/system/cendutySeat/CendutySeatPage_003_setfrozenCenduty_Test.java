package com.wymall.test.testcases.system.cendutySeat; 
import org.testng.annotations.Test; 
import com.wymall.test.base.BaseParpare; 
 import com.wymall.test.utils.SuperAction; 
public class CendutySeatPage_003_setfrozenCenduty_Test extends BaseParpare{ 
@Test 
 public void setfrozenCenduty() { 
SuperAction.parseExcel("system/CendutySeat","003_setfrozenCenduty",seleniumUtil);
 }
}