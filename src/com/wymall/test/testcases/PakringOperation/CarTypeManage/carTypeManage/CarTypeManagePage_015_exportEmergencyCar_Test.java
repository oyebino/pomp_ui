package com.wymall.test.testcases.PakringOperation.CarTypeManage.carTypeManage; 
import org.testng.annotations.Test; 
import com.wymall.test.base.BaseParpare; 
 import com.wymall.test.utils.SuperAction; 
public class CarTypeManagePage_015_exportEmergencyCar_Test extends BaseParpare{ 
@Test 
 public void exportEmergencyCar() { 
SuperAction.parseExcel("PakringOperation/CarTypeManage/CarTypeManage","015_exportEmergencyCar",seleniumUtil);
 }
}