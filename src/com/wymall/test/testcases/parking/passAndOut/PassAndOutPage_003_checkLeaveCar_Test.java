package com.wymall.test.testcases.parking.passAndOut; 
import org.testng.annotations.Test; 
import com.wymall.test.base.BaseParpare; 
 import com.wymall.test.utils.SuperAction; 
public class PassAndOutPage_003_checkLeaveCar_Test extends BaseParpare{ 
@Test 
 public void checkLeaveCar() { 
SuperAction.parseExcel("parking/PassAndOut","003_checkLeaveCar",seleniumUtil);
 }
}