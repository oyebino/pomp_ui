package com.wymall.test.testcases.parking.passAndOut; 
import org.testng.annotations.Test; 
import com.wymall.test.base.BaseParpare; 
 import com.wymall.test.utils.SuperAction; 
public class PassAndOutPage_010_exportAbnormalCarOut_Test extends BaseParpare{ 
@Test 
 public void exportAbnormalCarOut() { 
SuperAction.parseExcel("parking/PassAndOut","010_exportAbnormalCarOut",seleniumUtil);
 }
}