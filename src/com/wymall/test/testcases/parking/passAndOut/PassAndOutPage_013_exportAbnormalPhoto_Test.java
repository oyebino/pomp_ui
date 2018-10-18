package com.wymall.test.testcases.parking.passAndOut; 
import org.testng.annotations.Test; 
import com.wymall.test.base.BaseParpare; 
 import com.wymall.test.utils.SuperAction; 
public class PassAndOutPage_013_exportAbnormalPhoto_Test extends BaseParpare{ 
@Test 
 public void exportAbnormalPhoto() { 
SuperAction.parseExcel("parking/PassAndOut","013_exportAbnormalPhoto",seleniumUtil);
 }
}