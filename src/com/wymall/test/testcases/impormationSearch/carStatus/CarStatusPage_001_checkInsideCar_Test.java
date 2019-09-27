package com.wymall.test.testcases.impormationSearch.carStatus; 
import org.testng.annotations.Test; 
import com.wymall.test.base.BaseParpare; 
 import com.wymall.test.utils.SuperAction; 
public class CarStatusPage_001_checkInsideCar_Test extends BaseParpare{ 
@Test 
 public void checkInsideCar() { 
SuperAction.parseExcel("impormationSearch/CarStatus","001_checkInsideCar",seleniumUtil);
 }
}