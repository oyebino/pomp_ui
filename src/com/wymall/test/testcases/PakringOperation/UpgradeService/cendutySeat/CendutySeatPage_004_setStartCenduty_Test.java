package com.wymall.test.testcases.PakringOperation.UpgradeService.cendutySeat;

import org.testng.annotations.Test;
import com.wymall.test.base.BaseParpare;
import com.wymall.test.utils.SuperAction;

public class CendutySeatPage_004_setStartCenduty_Test extends BaseParpare {
    @Test
    public void setStartCenduty() {
        SuperAction.parseExcel("PakringOperation/UpgradeService/CendutySeat", "004_setStartCenduty", seleniumUtil);
    }
}