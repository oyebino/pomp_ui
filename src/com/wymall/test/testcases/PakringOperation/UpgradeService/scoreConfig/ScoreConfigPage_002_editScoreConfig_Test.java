package com.wymall.test.testcases.PakringOperation.UpgradeService.scoreConfig; 
import org.testng.annotations.Test; 
import com.wymall.test.base.BaseParpare; 
 import com.wymall.test.utils.SuperAction; 
public class ScoreConfigPage_002_editScoreConfig_Test extends BaseParpare{ 
@Test 
 public void editScoreConfig() { 
SuperAction.parseExcel("PakringOperation/UpgradeService/ScoreConfig","002_editScoreConfig",seleniumUtil);
 }
}