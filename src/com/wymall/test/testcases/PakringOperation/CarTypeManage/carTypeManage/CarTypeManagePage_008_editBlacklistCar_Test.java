package com.wymall.test.testcases.PakringOperation.CarTypeManage.carTypeManage; 
import org.testng.annotations.Test; 
import com.wymall.test.base.BaseParpare; 
 import com.wymall.test.utils.SuperAction; 
public class CarTypeManagePage_008_editBlacklistCar_Test extends BaseParpare{ 
@Test 
 public void editBlacklistCar() { 
SuperAction.parseExcel("PakringOperation/CarTypeManage/CarTypeManage","008_editBlacklistCar",seleniumUtil);
 }
}