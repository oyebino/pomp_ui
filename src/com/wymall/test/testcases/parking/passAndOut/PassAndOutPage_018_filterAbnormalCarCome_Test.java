package com.wymall.test.testcases.parking.passAndOut; 
import org.testng.annotations.Test; 
import com.wymall.test.base.BaseParpare; 
 import com.wymall.test.utils.SuperAction; 
public class PassAndOutPage_018_filterAbnormalCarCome_Test extends BaseParpare{ 
@Test 
 public void filterAbnormalCarCome() { 
SuperAction.parseExcel("parking/PassAndOut","018_filterAbnormalCarCome",seleniumUtil);
 }
}