package com.wymall.test.testcases.parking.passAndOut; 
import org.testng.annotations.Test; 
import com.wymall.test.base.BaseParpare; 
 import com.wymall.test.utils.SuperAction; 
public class PassAndOutPage_001_checkInsideCar_Test extends BaseParpare{ 
@Test 
 public void checkInsideCar() { 
SuperAction.parseExcel("parking/PassAndOut","001_checkInsideCar",seleniumUtil);
 }
}