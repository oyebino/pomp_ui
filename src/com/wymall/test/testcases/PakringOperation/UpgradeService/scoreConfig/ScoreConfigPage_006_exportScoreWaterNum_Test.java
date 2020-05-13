package com.wymall.test.testcases.PakringOperation.UpgradeService.scoreConfig;

import org.testng.annotations.Test;
import com.wymall.test.base.BaseParpare;
import com.wymall.test.utils.SuperAction;

public class ScoreConfigPage_006_exportScoreWaterNum_Test extends BaseParpare {
    @Test
    public void exportScoreWaterNum() {
        SuperAction.parseExcel("PakringOperation/UpgradeService/ScoreConfig", "006_exportScoreWaterNum", seleniumUtil);
    }
}