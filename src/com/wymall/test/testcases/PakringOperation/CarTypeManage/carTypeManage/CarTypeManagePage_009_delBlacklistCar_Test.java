package com.wymall.test.testcases.PakringOperation.CarTypeManage.carTypeManage; 
import org.testng.annotations.Test; 
import com.wymall.test.base.BaseParpare; 
 import com.wymall.test.utils.SuperAction; 
public class CarTypeManagePage_009_delBlacklistCar_Test extends BaseParpare{ 
@Test 
 public void delBlacklistCar() { 
SuperAction.parseExcel("PakringOperation/CarTypeManage/CarTypeManage","009_delBlacklistCar",seleniumUtil);
 }
}