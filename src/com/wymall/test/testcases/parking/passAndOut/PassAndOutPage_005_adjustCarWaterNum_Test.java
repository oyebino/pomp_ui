package com.wymall.test.testcases.parking.passAndOut; 
import org.testng.annotations.Test; 
import com.wymall.test.base.BaseParpare; 
 import com.wymall.test.utils.SuperAction; 
public class PassAndOutPage_005_adjustCarWaterNum_Test extends BaseParpare{ 
@Test 
 public void adjustCarWaterNum() { 
SuperAction.parseExcel("parking/PassAndOut","005_adjustCarWaterNum",seleniumUtil);
 }
}