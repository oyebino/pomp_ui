package com.wymall.test.testcases.parking.carInfoManager; 
import org.testng.annotations.Test; 
import com.wymall.test.base.BaseParpare; 
 import com.wymall.test.utils.SuperAction; 
public class CarInfoManagerPage_006_editBlacklistCar_Test extends BaseParpare{ 
@Test 
 public void editBlacklistCar() { 
SuperAction.parseExcel("parking/CarInfoManager","006_editBlacklistCar",seleniumUtil);
 }
}