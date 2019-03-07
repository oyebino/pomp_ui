package com.wymall.test.testcases.PakringOperation.ParkingManage.personalManage; 
import org.testng.annotations.Test; 
import com.wymall.test.base.BaseParpare; 
 import com.wymall.test.utils.SuperAction; 
public class PersonalManagePage_004_setFrozen_Test extends BaseParpare{ 
@Test 
 public void setFrozen() { 
SuperAction.parseExcel("PakringOperation/ParkingManage/PersonalManage","004_setFrozen",seleniumUtil);
 }
}