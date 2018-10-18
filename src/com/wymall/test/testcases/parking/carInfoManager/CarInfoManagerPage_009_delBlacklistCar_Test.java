package com.wymall.test.testcases.parking.carInfoManager; 
import org.testng.annotations.Test; 
import com.wymall.test.base.BaseParpare; 
 import com.wymall.test.utils.SuperAction; 
public class CarInfoManagerPage_009_delBlacklistCar_Test extends BaseParpare{ 
@Test 
 public void delBlacklistCar() { 
SuperAction.parseExcel("parking/CarInfoManager","009_delBlacklistCar",seleniumUtil);
 }
}