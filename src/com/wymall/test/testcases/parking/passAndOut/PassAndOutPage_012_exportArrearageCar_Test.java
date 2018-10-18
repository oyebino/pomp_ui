package com.wymall.test.testcases.parking.passAndOut; 
import org.testng.annotations.Test; 
import com.wymall.test.base.BaseParpare; 
 import com.wymall.test.utils.SuperAction; 
public class PassAndOutPage_012_exportArrearageCar_Test extends BaseParpare{ 
@Test 
 public void exportArrearageCar() { 
SuperAction.parseExcel("parking/PassAndOut","012_exportArrearageCar",seleniumUtil);
 }
}