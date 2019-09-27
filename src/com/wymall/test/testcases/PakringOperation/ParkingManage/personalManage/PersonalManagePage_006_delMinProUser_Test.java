package com.wymall.test.testcases.PakringOperation.ParkingManage.personalManage; 
import org.testng.annotations.Test; 
import com.wymall.test.base.BaseParpare; 
 import com.wymall.test.utils.SuperAction; 
public class PersonalManagePage_006_delMinProUser_Test extends BaseParpare{ 
@Test 
 public void delMinProUser() { 
SuperAction.parseExcel("PakringOperation/ParkingManage/PersonalManage","006_delMinProUser",seleniumUtil);
 }
}