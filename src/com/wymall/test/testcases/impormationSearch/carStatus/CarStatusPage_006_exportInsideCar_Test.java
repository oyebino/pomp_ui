package com.wymall.test.testcases.impormationSearch.carStatus; 
import org.testng.annotations.Test; 
import com.wymall.test.base.BaseParpare; 
 import com.wymall.test.utils.SuperAction; 
public class CarStatusPage_006_exportInsideCar_Test extends BaseParpare{ 
@Test 
 public void exportInsideCar() { 
SuperAction.parseExcel("impormationSearch/CarStatus","006_exportInsideCar",seleniumUtil);
 }
}