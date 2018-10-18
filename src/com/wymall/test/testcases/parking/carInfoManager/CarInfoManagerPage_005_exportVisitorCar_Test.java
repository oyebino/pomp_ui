package com.wymall.test.testcases.parking.carInfoManager; 
import org.testng.annotations.Test; 
import com.wymall.test.base.BaseParpare; 
 import com.wymall.test.utils.SuperAction; 
public class CarInfoManagerPage_005_exportVisitorCar_Test extends BaseParpare{ 
@Test 
 public void exportVisitorCar() { 
SuperAction.parseExcel("parking/CarInfoManager","005_exportVisitorCar",seleniumUtil);
 }
}