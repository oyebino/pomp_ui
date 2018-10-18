package com.wymall.test.testcases.parking.passAndOut; 
import org.testng.annotations.Test; 
import com.wymall.test.base.BaseParpare; 
 import com.wymall.test.utils.SuperAction; 
public class PassAndOutPage_014_exportAdjustWater_Test extends BaseParpare{ 
@Test 
 public void exportAdjustWater() { 
SuperAction.parseExcel("parking/PassAndOut","014_exportAdjustWater",seleniumUtil);
 }
}