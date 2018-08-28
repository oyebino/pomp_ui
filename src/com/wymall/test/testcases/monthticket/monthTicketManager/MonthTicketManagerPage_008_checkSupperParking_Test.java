package com.wymall.test.testcases.monthticket.monthTicketManager; 
import org.testng.annotations.Test; 
import com.wymall.test.base.BaseParpare; 
 import com.wymall.test.utils.SuperAction; 
public class MonthTicketManagerPage_008_checkSupperParking_Test extends BaseParpare{ 
@Test 
 public void checkSupperParking() { 
SuperAction.parseExcel("monthticket/MonthTicketManager","008_checkSupperParking",seleniumUtil);
 }
}