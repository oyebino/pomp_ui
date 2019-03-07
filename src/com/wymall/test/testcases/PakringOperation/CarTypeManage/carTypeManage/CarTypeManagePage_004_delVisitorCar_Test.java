package com.wymall.test.testcases.PakringOperation.CarTypeManage.carTypeManage; 
import org.testng.annotations.Test; 
import com.wymall.test.base.BaseParpare; 
 import com.wymall.test.utils.SuperAction; 
public class CarTypeManagePage_004_delVisitorCar_Test extends BaseParpare{ 
@Test 
 public void delVisitorCar() { 
SuperAction.parseExcel("PakringOperation/CarTypeManage/CarTypeManage","004_delVisitorCar",seleniumUtil);
 }
}