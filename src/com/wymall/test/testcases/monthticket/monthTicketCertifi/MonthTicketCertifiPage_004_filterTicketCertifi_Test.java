package com.wymall.test.testcases.monthticket.monthTicketCertifi; 
import org.testng.annotations.Test; 
import com.wymall.test.base.BaseParpare; 
 import com.wymall.test.utils.SuperAction; 
public class MonthTicketCertifiPage_004_filterTicketCertifi_Test extends BaseParpare{ 
@Test 
 public void filterTicketCertifi() { 
SuperAction.parseExcel("monthticket/MonthTicketCertifi","004_filterTicketCertifi",seleniumUtil);
 }
}