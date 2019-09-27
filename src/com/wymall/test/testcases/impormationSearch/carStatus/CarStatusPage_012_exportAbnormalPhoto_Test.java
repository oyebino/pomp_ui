package com.wymall.test.testcases.impormationSearch.carStatus; 
import org.testng.annotations.Test; 
import com.wymall.test.base.BaseParpare; 
 import com.wymall.test.utils.SuperAction; 
public class CarStatusPage_012_exportAbnormalPhoto_Test extends BaseParpare{ 
@Test 
 public void exportAbnormalPhoto() { 
SuperAction.parseExcel("impormationSearch/CarStatus","012_exportAbnormalPhoto",seleniumUtil);
 }
}