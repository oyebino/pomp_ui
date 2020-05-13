package com.wymall.test.testcases.PakringOperation.UpgradeService.scoreConfig;

import org.testng.annotations.Test;
import com.wymall.test.base.BaseParpare;
import com.wymall.test.utils.SuperAction;

public class ScoreConfigPage_010_checkScoreReport_Test extends BaseParpare {
    @Test
    public void checkScoreReport() {
        SuperAction.parseExcel("PakringOperation/UpgradeService/ScoreConfig", "010_checkScoreReport", seleniumUtil);
    }
}