package com.wymall.test.testcases.parking.carInfoManager; 
import org.testng.annotations.Test; 
import com.wymall.test.base.BaseParpare; 
 import com.wymall.test.utils.SuperAction; 
public class CarInfoManagerPage_013_editSpecialTypeCar_Test extends BaseParpare{ 
@Test 
 public void editSpecialTypeCar() { 
SuperAction.parseExcel("parking/CarInfoManager","013_editSpecialTypeCar",seleniumUtil);
 }
}