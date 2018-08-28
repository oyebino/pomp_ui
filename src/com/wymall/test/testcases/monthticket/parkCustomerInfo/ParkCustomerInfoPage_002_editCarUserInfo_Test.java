package com.wymall.test.testcases.monthticket.parkCustomerInfo; 
import org.testng.annotations.Test; 
import com.wymall.test.base.BaseParpare; 
 import com.wymall.test.utils.SuperAction; 
public class ParkCustomerInfoPage_002_editCarUserInfo_Test extends BaseParpare{ 
@Test 
 public void editCarUserInfo() { 
SuperAction.parseExcel("monthticket/ParkCustomerInfo","002_editCarUserInfo",seleniumUtil);
 }
}