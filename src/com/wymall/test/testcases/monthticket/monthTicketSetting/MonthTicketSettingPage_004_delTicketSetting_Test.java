package com.wymall.test.testcases.monthticket.monthTicketSetting; 
import org.testng.annotations.Test; 
import com.wymall.test.base.BaseParpare; 
 import com.wymall.test.utils.SuperAction; 
public class MonthTicketSettingPage_004_delTicketSetting_Test extends BaseParpare{ 
@Test 
 public void delTicketSetting() { 
SuperAction.parseExcel("monthticket/MonthTicketSetting","004_delTicketSetting",seleniumUtil);
 }
}