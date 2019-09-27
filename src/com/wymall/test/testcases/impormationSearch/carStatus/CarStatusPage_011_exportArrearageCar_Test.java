package com.wymall.test.testcases.impormationSearch.carStatus; 
import org.testng.annotations.Test; 
import com.wymall.test.base.BaseParpare; 
 import com.wymall.test.utils.SuperAction; 
public class CarStatusPage_011_exportArrearageCar_Test extends BaseParpare{ 
@Test 
 public void exportArrearageCar() { 
SuperAction.parseExcel("impormationSearch/CarStatus","011_exportArrearageCar",seleniumUtil);
 }
}