package com.wymall.test.testcases.preferential.business; 
import org.testng.annotations.Test; 
import com.wymall.test.base.BaseParpare; 
 import com.wymall.test.utils.SuperAction; 
public class BusinessPage_006_importBusiness_Test extends BaseParpare{ 
@Test 
 public void importBusiness() { 
SuperAction.parseExcel("preferential/Business","006_importBusiness",seleniumUtil);
 }
}