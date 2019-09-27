package com.wymall.test.testcases.PakringOperation.CarTypeManage.carTypeManage; 
import org.testng.annotations.Test; 
import com.wymall.test.base.BaseParpare; 
 import com.wymall.test.utils.SuperAction; 
public class CarTypeManagePage_018_editEmergencyCar_Test extends BaseParpare{ 
@Test 
 public void editEmergencyCar() { 
SuperAction.parseExcel("PakringOperation/CarTypeManage/CarTypeManage","018_editEmergencyCar",seleniumUtil);
 }
}