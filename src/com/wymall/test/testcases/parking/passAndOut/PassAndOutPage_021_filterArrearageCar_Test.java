package com.wymall.test.testcases.parking.passAndOut; 
import org.testng.annotations.Test; 
import com.wymall.test.base.BaseParpare; 
 import com.wymall.test.utils.SuperAction; 
public class PassAndOutPage_021_filterArrearageCar_Test extends BaseParpare{ 
@Test 
 public void filterArrearageCar() { 
SuperAction.parseExcel("parking/PassAndOut","021_filterArrearageCar",seleniumUtil);
 }
}