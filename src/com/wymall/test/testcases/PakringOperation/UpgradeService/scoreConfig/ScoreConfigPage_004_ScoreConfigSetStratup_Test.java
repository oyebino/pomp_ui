package com.wymall.test.testcases.PakringOperation.UpgradeService.scoreConfig; 
import org.testng.annotations.Test; 
import com.wymall.test.base.BaseParpare; 
 import com.wymall.test.utils.SuperAction; 
public class ScoreConfigPage_004_ScoreConfigSetStratup_Test extends BaseParpare{ 
@Test 
 public void scoreConfigSetStratup() { 
SuperAction.parseExcel("PakringOperation/UpgradeService/ScoreConfig","004_ScoreConfigSetStratup",seleniumUtil);
 }
}