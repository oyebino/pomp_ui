package com.wymall.test.testcases.impormationSearch.carStatus; 
import org.testng.annotations.Test; 
import com.wymall.test.base.BaseParpare; 
 import com.wymall.test.utils.SuperAction; 
public class CarStatusPage_018_filterNoSystemOpening_Test extends BaseParpare{ 
@Test 
 public void filterNoSystemOpening() { 
SuperAction.parseExcel("impormationSearch/CarStatus","018_filterNoSystemOpening",seleniumUtil);
 }
}