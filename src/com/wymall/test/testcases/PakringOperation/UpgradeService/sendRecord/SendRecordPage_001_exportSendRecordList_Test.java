package com.wymall.test.testcases.PakringOperation.UpgradeService.sendRecord; 
import org.testng.annotations.Test; 
import com.wymall.test.base.BaseParpare; 
 import com.wymall.test.utils.SuperAction; 
public class SendRecordPage_001_exportSendRecordList_Test extends BaseParpare{ 
@Test 
 public void exportSendRecordList() { 
SuperAction.parseExcel("PakringOperation/UpgradeService/SendRecord","001_exportSendRecordList",seleniumUtil);
 }
}