package com.wymall.test.testcases.impormationSearch.carStatus; 
import org.testng.annotations.Test; 
import com.wymall.test.base.BaseParpare; 
 import com.wymall.test.utils.SuperAction; 
public class CarStatusPage_019_filterArrearageCar_Test extends BaseParpare{ 
@Test 
 public void filterArrearageCar() { 
SuperAction.parseExcel("impormationSearch/CarStatus","019_filterArrearageCar",seleniumUtil);
 }
}