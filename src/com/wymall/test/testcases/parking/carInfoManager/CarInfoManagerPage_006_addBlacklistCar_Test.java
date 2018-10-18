package com.wymall.test.testcases.parking.carInfoManager; 
import org.testng.annotations.Test; 
import com.wymall.test.base.BaseParpare; 
 import com.wymall.test.utils.SuperAction; 
public class CarInfoManagerPage_006_addBlacklistCar_Test extends BaseParpare{ 
@Test 
 public void addBlacklistCar() { 
SuperAction.parseExcel("parking/CarInfoManager","006_addBlacklistCar",seleniumUtil);
 }
}