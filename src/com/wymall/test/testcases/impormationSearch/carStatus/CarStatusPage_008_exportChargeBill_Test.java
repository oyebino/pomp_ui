package com.wymall.test.testcases.impormationSearch.carStatus; 
import org.testng.annotations.Test; 
import com.wymall.test.base.BaseParpare; 
 import com.wymall.test.utils.SuperAction; 
public class CarStatusPage_008_exportChargeBill_Test extends BaseParpare{ 
@Test 
 public void exportChargeBill() { 
SuperAction.parseExcel("impormationSearch/CarStatus","008_exportChargeBill",seleniumUtil);
 }
}