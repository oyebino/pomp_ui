package com.wymall.test.testcases.PakringOperation.MonthTicketManage.monthTicketCertifi; 
import org.testng.annotations.Test; 
import com.wymall.test.base.BaseParpare; 
 import com.wymall.test.utils.SuperAction; 
public class MonthTicketCertifiPage_006_checkCertifiRule_Test extends BaseParpare{ 
@Test 
 public void checkCertifiRule() { 
SuperAction.parseExcel("PakringOperation/MonthTicketManage/MonthTicketCertifi","006_checkCertifiRule",seleniumUtil);
 }
}