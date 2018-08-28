package com.wymall.test.testcases.parking.carInfoManager; 
import org.testng.annotations.Test; 
import com.wymall.test.base.BaseParpare; 
 import com.wymall.test.utils.SuperAction; 
public class CarInfoManagerPage_007_delBlacklistCar_Test extends BaseParpare{ 
@Test 
 public void delBlacklistCar() { 
SuperAction.parseExcel("parking/CarInfoManager","007_delBlacklistCar",seleniumUtil);
 }
}