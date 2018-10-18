package com.wymall.test.testcases.monthticket.parkCustomerInfo; 
import org.testng.annotations.Test; 
import com.wymall.test.base.BaseParpare; 
 import com.wymall.test.utils.SuperAction; 
public class ParkCustomerInfoPage_004_exportCarUserInfo_Test extends BaseParpare{ 
@Test 
 public void exportCarUserInfo() { 
SuperAction.parseExcel("monthticket/ParkCustomerInfo","004_exportCarUserInfo",seleniumUtil);
 }
}