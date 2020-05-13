package com.wymall.test.testcases.PakringOperation.UpgradeService.scoreConfig;

import org.testng.annotations.Test;
import com.wymall.test.base.BaseParpare;
import com.wymall.test.utils.SuperAction;

public class ScoreConfigPage_007_exportScoreReport_Test extends BaseParpare {
    @Test
    public void exportScoreReport() {
        SuperAction.parseExcel("PakringOperation/UpgradeService/ScoreConfig", "007_exportScoreReport", seleniumUtil);
    }
}