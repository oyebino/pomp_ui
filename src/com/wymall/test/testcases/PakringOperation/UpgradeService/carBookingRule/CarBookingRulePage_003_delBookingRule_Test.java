package com.wymall.test.testcases.PakringOperation.UpgradeService.carBookingRule;

import org.testng.annotations.Test;
import com.wymall.test.base.BaseParpare;
import com.wymall.test.utils.SuperAction;

public class CarBookingRulePage_003_delBookingRule_Test extends BaseParpare {
    @Test
    public void delBookingRule() {
        SuperAction.parseExcel("PakringOperation/UpgradeService/CarBookingRule", "003_delBookingRule", seleniumUtil);
    }
}