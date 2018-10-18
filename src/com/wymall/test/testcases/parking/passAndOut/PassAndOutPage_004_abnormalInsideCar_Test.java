package com.wymall.test.testcases.parking.passAndOut; 
import org.testng.annotations.Test; 
import com.wymall.test.base.BaseParpare; 
 import com.wymall.test.utils.SuperAction; 
public class PassAndOutPage_004_abnormalInsideCar_Test extends BaseParpare{ 
@Test 
 public void abnormalInsideCar() { 
SuperAction.parseExcel("parking/PassAndOut","004_abnormalInsideCar",seleniumUtil);
 }
}