package com.wymall.test.testcases.PakringOperation.UpgradeService.cendutySeat;

import org.testng.annotations.Test;
import com.wymall.test.base.BaseParpare;
import com.wymall.test.utils.SuperAction;

public class CendutySeatPage_003_setfrozenCenduty_Test extends BaseParpare {
    @Test
    public void setfrozenCenduty() {
        SuperAction.parseExcel("PakringOperation/UpgradeService/CendutySeat", "003_setfrozenCenduty", seleniumUtil);
    }
}