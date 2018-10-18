package com.wymall.test.testcases.monthticket.parkCustomerInfo; 
import org.testng.annotations.Test; 
import com.wymall.test.base.BaseParpare; 
 import com.wymall.test.utils.SuperAction; 
public class ParkCustomerInfoPage_002_editParkCustomerInfo_Test extends BaseParpare{ 
@Test 
 public void editParkCustomerInfo() { 
SuperAction.parseExcel("monthticket/ParkCustomerInfo","002_editParkCustomerInfo",seleniumUtil);
 }
}