package com.wymall.test.testcases.parking.passAndOut; 
import org.testng.annotations.Test; 
import com.wymall.test.base.BaseParpare; 
 import com.wymall.test.utils.SuperAction; 
public class PassAndOutPage_019_filterAbnormalCarOut_Test extends BaseParpare{ 
@Test 
 public void filterAbnormalCarOut() { 
SuperAction.parseExcel("parking/PassAndOut","019_filterAbnormalCarOut",seleniumUtil);
 }
}