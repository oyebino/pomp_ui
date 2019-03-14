package com.wymall.test.testcases.PakringOperation.UpgradeService.scoreConfig; 
import org.testng.annotations.Test; 
import com.wymall.test.base.BaseParpare; 
 import com.wymall.test.utils.SuperAction; 
public class ScoreConfigPage_009_checkScoreWaterNum_Test extends BaseParpare{ 
@Test 
 public void checkScoreWaterNum() { 
SuperAction.parseExcel("PakringOperation/UpgradeService/ScoreConfig","009_checkScoreWaterNum",seleniumUtil);
 }
}