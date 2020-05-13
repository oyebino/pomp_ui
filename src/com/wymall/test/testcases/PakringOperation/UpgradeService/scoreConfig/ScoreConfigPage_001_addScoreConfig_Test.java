package com.wymall.test.testcases.PakringOperation.UpgradeService.scoreConfig;

import org.testng.annotations.Test;
import com.wymall.test.base.BaseParpare;
import com.wymall.test.utils.SuperAction;

public class ScoreConfigPage_001_addScoreConfig_Test extends BaseParpare {
    @Test
    public void addScoreConfig() {
        SuperAction.parseExcel("PakringOperation/UpgradeService/ScoreConfig", "001_addScoreConfig", seleniumUtil);
    }
}