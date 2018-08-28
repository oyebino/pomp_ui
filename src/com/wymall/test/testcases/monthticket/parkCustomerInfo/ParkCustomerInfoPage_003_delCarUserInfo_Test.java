package com.wymall.test.testcases.monthticket.parkCustomerInfo; 
import org.testng.annotations.Test; 
import com.wymall.test.base.BaseParpare; 
 import com.wymall.test.utils.SuperAction; 
public class ParkCustomerInfoPage_003_delCarUserInfo_Test extends BaseParpare{ 
@Test 
 public void delCarUserInfo() { 
SuperAction.parseExcel("monthticket/ParkCustomerInfo","003_delCarUserInfo",seleniumUtil);
 }
}