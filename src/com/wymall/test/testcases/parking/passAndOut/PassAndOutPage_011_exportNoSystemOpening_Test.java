package com.wymall.test.testcases.parking.passAndOut; 
import org.testng.annotations.Test; 
import com.wymall.test.base.BaseParpare; 
 import com.wymall.test.utils.SuperAction; 
public class PassAndOutPage_011_exportNoSystemOpening_Test extends BaseParpare{ 
@Test 
 public void exportNoSystemOpening() { 
SuperAction.parseExcel("parking/PassAndOut","011_exportNoSystemOpening",seleniumUtil);
 }
}