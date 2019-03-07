package com.wymall.test.testcases.impormationSearch.carStatus; 
import org.testng.annotations.Test; 
import com.wymall.test.base.BaseParpare; 
 import com.wymall.test.utils.SuperAction; 
public class CarStatusPage_007_exportLeaveCar_Test extends BaseParpare{ 
@Test 
 public void exportLeaveCar() { 
SuperAction.parseExcel("impormationSearch/CarStatus","007_exportLeaveCar",seleniumUtil);
 }
}