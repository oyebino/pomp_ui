package com.wymall.test.testcases.impormationSearch.carStatus; 
import org.testng.annotations.Test; 
import com.wymall.test.base.BaseParpare; 
 import com.wymall.test.utils.SuperAction; 
public class CarStatusPage_021_filterAdjustWater_Test extends BaseParpare{ 
@Test 
 public void filterAdjustWater() { 
SuperAction.parseExcel("impormationSearch/CarStatus","021_filterAdjustWater",seleniumUtil);
 }
}