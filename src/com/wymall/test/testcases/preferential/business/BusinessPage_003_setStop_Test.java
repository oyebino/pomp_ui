package com.wymall.test.testcases.preferential.business; 
import org.testng.annotations.Test; 
import com.wymall.test.base.BaseParpare; 
 import com.wymall.test.utils.SuperAction; 
public class BusinessPage_003_setStop_Test extends BaseParpare{ 
@Test 
 public void setStop() { 
SuperAction.parseExcel("preferential/Business","003_setStop",seleniumUtil);
 }
}