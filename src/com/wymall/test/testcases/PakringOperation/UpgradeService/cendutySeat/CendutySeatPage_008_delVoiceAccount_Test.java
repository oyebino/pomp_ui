package com.wymall.test.testcases.PakringOperation.UpgradeService.cendutySeat; 
import org.testng.annotations.Test; 
import com.wymall.test.base.BaseParpare; 
 import com.wymall.test.utils.SuperAction; 
public class CendutySeatPage_008_delVoiceAccount_Test extends BaseParpare{ 
@Test 
 public void delVoiceAccount() { 
SuperAction.parseExcel("PakringOperation/UpgradeService/CendutySeat","008_delVoiceAccount",seleniumUtil);
 }
}