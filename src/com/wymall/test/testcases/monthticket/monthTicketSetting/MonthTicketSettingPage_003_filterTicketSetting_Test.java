package com.wymall.test.testcases.monthticket.monthTicketSetting; 
import org.testng.annotations.Test; 
import com.wymall.test.base.BaseParpare; 
 import com.wymall.test.utils.SuperAction; 
public class MonthTicketSettingPage_003_filterTicketSetting_Test extends BaseParpare{ 
@Test 
 public void filterTicketSetting() { 
SuperAction.parseExcel("monthticket/MonthTicketSetting","003_filterTicketSetting",seleniumUtil);
 }
}