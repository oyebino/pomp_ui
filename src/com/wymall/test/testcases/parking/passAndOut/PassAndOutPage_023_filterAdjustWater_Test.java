package com.wymall.test.testcases.parking.passAndOut; 
import org.testng.annotations.Test; 
import com.wymall.test.base.BaseParpare; 
 import com.wymall.test.utils.SuperAction; 
public class PassAndOutPage_023_filterAdjustWater_Test extends BaseParpare{ 
@Test 
 public void filterAdjustWater() { 
SuperAction.parseExcel("parking/PassAndOut","023_filterAdjustWater",seleniumUtil);
 }
}