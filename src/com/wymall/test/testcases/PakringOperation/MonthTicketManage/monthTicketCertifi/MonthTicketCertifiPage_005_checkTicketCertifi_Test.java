package com.wymall.test.testcases.PakringOperation.MonthTicketManage.monthTicketCertifi; 
import org.testng.annotations.Test; 
import com.wymall.test.base.BaseParpare; 
 import com.wymall.test.utils.SuperAction; 
public class MonthTicketCertifiPage_005_checkTicketCertifi_Test extends BaseParpare{ 
@Test 
 public void checkTicketCertifi() { 
SuperAction.parseExcel("PakringOperation/MonthTicketManage/MonthTicketCertifi","005_checkTicketCertifi",seleniumUtil);
 }
}