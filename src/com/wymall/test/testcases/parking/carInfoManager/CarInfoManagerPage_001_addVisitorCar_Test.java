package com.wymall.test.testcases.parking.carInfoManager; 
import org.testng.annotations.Test; 
import com.wymall.test.base.BaseParpare; 
 import com.wymall.test.utils.SuperAction; 
public class CarInfoManagerPage_001_addVisitorCar_Test extends BaseParpare{ 
@Test 
 public void addVisitorCar() { 
SuperAction.parseExcel("parking/CarInfoManager","001_addVisitorCar",seleniumUtil);
 }
}