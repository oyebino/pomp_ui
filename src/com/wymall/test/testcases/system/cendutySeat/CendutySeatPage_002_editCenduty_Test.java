package com.wymall.test.testcases.system.cendutySeat; 
import org.testng.annotations.Test; 
import com.wymall.test.base.BaseParpare; 
 import com.wymall.test.utils.SuperAction; 
public class CendutySeatPage_002_editCenduty_Test extends BaseParpare{ 
@Test 
 public void editCenduty() { 
SuperAction.parseExcel("system/CendutySeat","002_editCenduty",seleniumUtil);
 }
}