package com.wymall.test.testcases.parking.passAndOut; 
import org.testng.annotations.Test; 
import com.wymall.test.base.BaseParpare; 
 import com.wymall.test.utils.SuperAction; 
public class PassAndOutPage_009_exportAbnormalCarCome_Test extends BaseParpare{ 
@Test 
 public void exportAbnormalCarCome() { 
SuperAction.parseExcel("parking/PassAndOut","009_exportAbnormalCarCome",seleniumUtil);
 }
}