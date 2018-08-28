package com.wymall.test.testcases.monthticket.parkCustomerInfo; 
import org.testng.annotations.Test; 
import com.wymall.test.base.BaseParpare; 
 import com.wymall.test.utils.SuperAction; 
public class ParkCustomerInfoPage_001_addCarUserInfo_Test extends BaseParpare{ 
@Test 
 public void addCarUserInfo() { 
SuperAction.parseExcel("monthticket/ParkCustomerInfo","001_addCarUserInfo",seleniumUtil);
 }
}