package com.wymall.test.testcases.preferential.sell; 
import org.testng.annotations.Test; 
import com.wymall.test.base.BaseParpare; 
 import com.wymall.test.utils.SuperAction; 
public class SellPage_005_exportBusinessTicketCode_Test extends BaseParpare{ 
@Test 
 public void exportBusinessTicketCode() { 
SuperAction.parseExcel("preferential/Sell","005_exportBusinessTicketCode",seleniumUtil);
 }
}