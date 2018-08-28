package com.wymall.test.testcases.monthticket.monthTicketSetting; 
import org.testng.annotations.Test; 
import com.wymall.test.base.BaseParpare; 
 import com.wymall.test.utils.SuperAction; 
public class MonthTicketSettingPage_001_addTicketSetting_Test extends BaseParpare{ 
@Test 
 public void addTicketSetting() { 
SuperAction.parseExcel("monthticket/MonthTicketSetting","001_addTicketSetting",seleniumUtil);
 }
}