package com.wymall.test.testcases.parking.carInfoManager; 
import org.testng.annotations.Test; 
import com.wymall.test.base.BaseParpare; 
 import com.wymall.test.utils.SuperAction; 
public class CarInfoManagerPage_008_addSpecialTypeCar_Test extends BaseParpare{ 
@Test 
 public void addSpecialTypeCar() { 
SuperAction.parseExcel("parking/CarInfoManager","008_addSpecialTypeCar",seleniumUtil);
 }
}