package com.wymall.test.testcases.PakringOperation.CarTypeManage.carTypeManage; 
import org.testng.annotations.Test; 
import com.wymall.test.base.BaseParpare; 
 import com.wymall.test.utils.SuperAction; 
public class CarTypeManagePage_019_delEmergencyCar_Test extends BaseParpare{ 
@Test 
 public void delEmergencyCar() { 
SuperAction.parseExcel("PakringOperation/CarTypeManage/CarTypeManage","019_delEmergencyCar",seleniumUtil);
 }
}