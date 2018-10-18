package com.wymall.test.testcases.parking.carInfoManager; 
import org.testng.annotations.Test; 
import com.wymall.test.base.BaseParpare; 
 import com.wymall.test.utils.SuperAction; 
public class CarInfoManagerPage_007_filterBlacklistCar_Test extends BaseParpare{ 
@Test 
 public void filterBlacklistCar() { 
SuperAction.parseExcel("parking/CarInfoManager","007_filterBlacklistCar",seleniumUtil);
 }
}