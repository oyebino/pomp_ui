package com.wymall.test.testcases.monthticket.monthTicketSetting; 
import org.testng.annotations.Test; 
import com.wymall.test.base.BaseParpare; 
 import com.wymall.test.utils.SuperAction; 
public class MonthTicketSettingPage_002_editTicketSetting_Test extends BaseParpare{ 
@Test 
 public void editTicketSetting() { 
SuperAction.parseExcel("monthticket/MonthTicketSetting","002_editTicketSetting",seleniumUtil);
 }
}