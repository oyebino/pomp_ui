package com.wymall.test.testcases.impormationSearch.carStatus; 
import org.testng.annotations.Test; 
import com.wymall.test.base.BaseParpare; 
 import com.wymall.test.utils.SuperAction; 
public class CarStatusPage_016_filterChargeBill_Test extends BaseParpare{ 
@Test 
 public void filterChargeBill() { 
SuperAction.parseExcel("impormationSearch/CarStatus","016_filterChargeBill",seleniumUtil);
 }
}