package com.wymall.test.testcases.monthticket.monthTicketCertifi; 
import org.testng.annotations.Test; 
import com.wymall.test.base.BaseParpare; 
 import com.wymall.test.utils.SuperAction; 
public class MonthTicketCertifiPage_003_editTicketCertifi_Test extends BaseParpare{ 
@Test 
 public void editTicketCertifi() { 
SuperAction.parseExcel("monthticket/MonthTicketCertifi","003_editTicketCertifi",seleniumUtil);
 }
}