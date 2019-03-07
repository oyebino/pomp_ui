package com.wymall.test.testcases.PakringOperation.UpgradeService.sendRecord; 
import org.testng.annotations.Test; 
import com.wymall.test.base.BaseParpare; 
 import com.wymall.test.utils.SuperAction; 
public class SendRecordPage_002_checkSendRecord_Test extends BaseParpare{ 
@Test 
 public void checkSendRecord() { 
SuperAction.parseExcel("PakringOperation/UpgradeService/SendRecord","002_checkSendRecord",seleniumUtil);
 }
}