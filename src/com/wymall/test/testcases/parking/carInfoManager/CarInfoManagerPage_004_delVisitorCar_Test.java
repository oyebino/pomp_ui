package com.wymall.test.testcases.parking.carInfoManager; 
import org.testng.annotations.Test; 
import com.wymall.test.base.BaseParpare; 
 import com.wymall.test.utils.SuperAction; 
public class CarInfoManagerPage_004_delVisitorCar_Test extends BaseParpare{ 
@Test 
 public void delVisitorCar() { 
SuperAction.parseExcel("parking/CarInfoManager","004_delVisitorCar",seleniumUtil);
 }
}