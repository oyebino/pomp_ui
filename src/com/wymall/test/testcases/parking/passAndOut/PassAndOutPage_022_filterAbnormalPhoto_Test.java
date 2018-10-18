package com.wymall.test.testcases.parking.passAndOut; 
import org.testng.annotations.Test; 
import com.wymall.test.base.BaseParpare; 
 import com.wymall.test.utils.SuperAction; 
public class PassAndOutPage_022_filterAbnormalPhoto_Test extends BaseParpare{ 
@Test 
 public void filterAbnormalPhoto() { 
SuperAction.parseExcel("parking/PassAndOut","022_filterAbnormalPhoto",seleniumUtil);
 }
}