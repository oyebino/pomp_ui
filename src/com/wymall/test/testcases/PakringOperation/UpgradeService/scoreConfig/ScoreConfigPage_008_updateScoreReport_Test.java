package com.wymall.test.testcases.PakringOperation.UpgradeService.scoreConfig;

import org.testng.annotations.Test;
import com.wymall.test.base.BaseParpare;
import com.wymall.test.utils.SuperAction;

public class ScoreConfigPage_008_updateScoreReport_Test extends BaseParpare {
    @Test
    public void updateScoreReport() {
        SuperAction.parseExcel("PakringOperation/UpgradeService/ScoreConfig", "008_updateScoreReport", seleniumUtil);
    }
}