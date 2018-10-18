package com.wymall.test.testcases.parking.passAndOut; 
import org.testng.annotations.Test; 
import com.wymall.test.base.BaseParpare; 
 import com.wymall.test.utils.SuperAction; 
public class PassAndOutPage_020_filterNoSystemOpening_Test extends BaseParpare{ 
@Test 
 public void filterNoSystemOpening() { 
SuperAction.parseExcel("parking/PassAndOut","020_filterNoSystemOpening",seleniumUtil);
 }
}