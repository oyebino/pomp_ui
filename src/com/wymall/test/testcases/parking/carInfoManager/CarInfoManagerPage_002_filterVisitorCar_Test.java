package com.wymall.test.testcases.parking.carInfoManager; 
import org.testng.annotations.Test; 
import com.wymall.test.base.BaseParpare; 
 import com.wymall.test.utils.SuperAction; 
public class CarInfoManagerPage_002_filterVisitorCar_Test extends BaseParpare{ 
@Test 
 public void filterVisitorCar() { 
SuperAction.parseExcel("parking/CarInfoManager","002_filterVisitorCar",seleniumUtil);
 }
}