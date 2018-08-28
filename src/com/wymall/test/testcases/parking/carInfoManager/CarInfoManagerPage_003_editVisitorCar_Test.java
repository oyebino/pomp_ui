package com.wymall.test.testcases.parking.carInfoManager; 
import org.testng.annotations.Test; 
import com.wymall.test.base.BaseParpare; 
 import com.wymall.test.utils.SuperAction; 
public class CarInfoManagerPage_003_editVisitorCar_Test extends BaseParpare{ 
@Test 
 public void editVisitorCar() { 
SuperAction.parseExcel("parking/CarInfoManager","003_editVisitorCar",seleniumUtil);
 }
}