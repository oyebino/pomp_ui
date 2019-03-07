package com.wymall.test.testcases.impormationSearch.carStatus; 
import org.testng.annotations.Test; 
import com.wymall.test.base.BaseParpare; 
 import com.wymall.test.utils.SuperAction; 
public class CarStatusPage_007_checkLeaveCarDetail_Test extends BaseParpare{ 
@Test 
 public void checkLeaveCarDetail() { 
SuperAction.parseExcel("impormationSearch/CarStatus","007_checkLeaveCarDetail",seleniumUtil);
 }
}