package com.wymall.test.testcases.PakringOperation.UpgradeService.scoreConfig;

import org.testng.annotations.Test;
import com.wymall.test.base.BaseParpare;
import com.wymall.test.utils.SuperAction;

public class ScoreConfigPage_005_delScoreConfig_Test extends BaseParpare {
    @Test
    public void delScoreConfig() {
        SuperAction.parseExcel("PakringOperation/UpgradeService/ScoreConfig", "005_delScoreConfig", seleniumUtil);
    }
}