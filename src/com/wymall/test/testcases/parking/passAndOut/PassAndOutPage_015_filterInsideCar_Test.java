package com.wymall.test.testcases.parking.passAndOut; 
import org.testng.annotations.Test; 
import com.wymall.test.base.BaseParpare; 
 import com.wymall.test.utils.SuperAction; 
public class PassAndOutPage_015_filterInsideCar_Test extends BaseParpare{ 
@Test 
 public void filterInsideCar() { 
SuperAction.parseExcel("parking/PassAndOut","015_filterInsideCar",seleniumUtil);
 }
}