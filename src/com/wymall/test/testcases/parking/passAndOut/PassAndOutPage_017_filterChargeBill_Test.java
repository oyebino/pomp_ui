package com.wymall.test.testcases.parking.passAndOut; 
import org.testng.annotations.Test; 
import com.wymall.test.base.BaseParpare; 
 import com.wymall.test.utils.SuperAction; 
public class PassAndOutPage_017_filterChargeBill_Test extends BaseParpare{ 
@Test 
 public void filterChargeBill() { 
SuperAction.parseExcel("parking/PassAndOut","017_filterChargeBill",seleniumUtil);
 }
}