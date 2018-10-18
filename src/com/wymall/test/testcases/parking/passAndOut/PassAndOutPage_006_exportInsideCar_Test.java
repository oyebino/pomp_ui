package com.wymall.test.testcases.parking.passAndOut; 
import org.testng.annotations.Test; 
import com.wymall.test.base.BaseParpare; 
 import com.wymall.test.utils.SuperAction; 
public class PassAndOutPage_006_exportInsideCar_Test extends BaseParpare{ 
@Test 
 public void exportInsideCar() { 
SuperAction.parseExcel("parking/PassAndOut","006_exportInsideCar",seleniumUtil);
 }
}