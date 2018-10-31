package com.wymall.test.testcases.monthticket.monthTicketCertifi; 
import org.testng.annotations.Test; 
import com.wymall.test.base.BaseParpare; 
 import com.wymall.test.utils.SuperAction; 
public class MonthTicketCertifiPage_002_addTicketCertifi_Test extends BaseParpare{ 
@Test 
 public void addTicketCertifi() { 
SuperAction.parseExcel("monthticket/MonthTicketCertifi","002_addTicketCertifi",seleniumUtil);
 }
}