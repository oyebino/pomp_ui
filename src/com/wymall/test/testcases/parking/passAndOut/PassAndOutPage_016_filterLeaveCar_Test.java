package com.wymall.test.testcases.parking.passAndOut; 
import org.testng.annotations.Test; 
import com.wymall.test.base.BaseParpare; 
 import com.wymall.test.utils.SuperAction; 
public class PassAndOutPage_016_filterLeaveCar_Test extends BaseParpare{ 
@Test 
 public void filterLeaveCar() { 
SuperAction.parseExcel("parking/PassAndOut","016_filterLeaveCar",seleniumUtil);
 }
}