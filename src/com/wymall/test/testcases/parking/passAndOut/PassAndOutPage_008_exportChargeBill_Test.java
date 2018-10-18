package com.wymall.test.testcases.parking.passAndOut; 
import org.testng.annotations.Test; 
import com.wymall.test.base.BaseParpare; 
 import com.wymall.test.utils.SuperAction; 
public class PassAndOutPage_008_exportChargeBill_Test extends BaseParpare{ 
@Test 
 public void exportChargeBill() { 
SuperAction.parseExcel("parking/PassAndOut","008_exportChargeBill",seleniumUtil);
 }
}