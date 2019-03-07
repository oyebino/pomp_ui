package com.wymall.test.testcases.PakringOperation.CarTypeManage.carTypeManage; 
import org.testng.annotations.Test; 
import com.wymall.test.base.BaseParpare; 
 import com.wymall.test.utils.SuperAction; 
public class CarTypeManagePage_005_exportVisitorCar_Test extends BaseParpare{ 
@Test 
 public void exportVisitorCar() { 
SuperAction.parseExcel("PakringOperation/CarTypeManage/CarTypeManage","005_exportVisitorCar",seleniumUtil);
 }
}