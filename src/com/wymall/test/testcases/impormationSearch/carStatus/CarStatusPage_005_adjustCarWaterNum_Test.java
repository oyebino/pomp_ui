package com.wymall.test.testcases.impormationSearch.carStatus; 
import org.testng.annotations.Test; 
import com.wymall.test.base.BaseParpare; 
 import com.wymall.test.utils.SuperAction; 
public class CarStatusPage_005_adjustCarWaterNum_Test extends BaseParpare{ 
@Test 
 public void adjustCarWaterNum() { 
SuperAction.parseExcel("impormationSearch/CarStatus","005_adjustCarWaterNum",seleniumUtil);
 }
}