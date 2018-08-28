package com.wymall.test.testcases.parking.passAndOut; 
import org.testng.annotations.Test; 
import com.wymall.test.base.BaseParpare; 
 import com.wymall.test.utils.SuperAction; 
public class PassAndOutPage_002_checkChargeBill_Test extends BaseParpare{ 
@Test 
 public void checkChargeBill() { 
SuperAction.parseExcel("parking/PassAndOut","002_checkChargeBill",seleniumUtil);
 }
}