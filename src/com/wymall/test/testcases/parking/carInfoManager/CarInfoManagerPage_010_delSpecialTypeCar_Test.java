package com.wymall.test.testcases.parking.carInfoManager; 
import org.testng.annotations.Test; 
import com.wymall.test.base.BaseParpare; 
 import com.wymall.test.utils.SuperAction; 
public class CarInfoManagerPage_010_delSpecialTypeCar_Test extends BaseParpare{ 
@Test 
 public void delSpecialTypeCar() { 
SuperAction.parseExcel("parking/CarInfoManager","010_delSpecialTypeCar",seleniumUtil);
 }
}