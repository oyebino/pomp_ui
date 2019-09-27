package com.wymall.test.testcases.PakringOperation.CarTypeManage.carTypeManage; 
import org.testng.annotations.Test; 
import com.wymall.test.base.BaseParpare; 
 import com.wymall.test.utils.SuperAction; 
public class CarTypeManagePage_013_editSpecialTypeCar_Test extends BaseParpare{ 
@Test 
 public void editSpecialTypeCar() { 
SuperAction.parseExcel("PakringOperation/CarTypeManage/CarTypeManage","013_editSpecialTypeCar",seleniumUtil);
 }
}