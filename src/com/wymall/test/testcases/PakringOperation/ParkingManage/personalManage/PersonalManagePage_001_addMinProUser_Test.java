package com.wymall.test.testcases.PakringOperation.ParkingManage.personalManage; 
import org.testng.annotations.Test; 
import com.wymall.test.base.BaseParpare; 
 import com.wymall.test.utils.SuperAction; 
public class PersonalManagePage_001_addMinProUser_Test extends BaseParpare{ 
@Test 
 public void addMinProUser() { 
SuperAction.parseExcel("PakringOperation/ParkingManage/PersonalManage","001_addMinProUser",seleniumUtil);
 }
}