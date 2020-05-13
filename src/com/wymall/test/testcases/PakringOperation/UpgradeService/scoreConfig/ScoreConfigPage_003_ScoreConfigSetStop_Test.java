package com.wymall.test.testcases.PakringOperation.UpgradeService.scoreConfig;

import org.testng.annotations.Test;
import com.wymall.test.base.BaseParpare;
import com.wymall.test.utils.SuperAction;

public class ScoreConfigPage_003_ScoreConfigSetStop_Test extends BaseParpare {
    @Test
    public void scoreConfigSetStop() {
        SuperAction.parseExcel("PakringOperation/UpgradeService/ScoreConfig", "003_ScoreConfigSetStop", seleniumUtil);
    }
}