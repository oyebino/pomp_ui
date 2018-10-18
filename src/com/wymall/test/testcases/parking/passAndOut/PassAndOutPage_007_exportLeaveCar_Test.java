package com.wymall.test.testcases.parking.passAndOut; 
import org.testng.annotations.Test; 
import com.wymall.test.base.BaseParpare; 
 import com.wymall.test.utils.SuperAction; 
public class PassAndOutPage_007_exportLeaveCar_Test extends BaseParpare{ 
@Test 
 public void exportLeaveCar() { 
SuperAction.parseExcel("parking/PassAndOut","007_exportLeaveCar",seleniumUtil);
 }
}