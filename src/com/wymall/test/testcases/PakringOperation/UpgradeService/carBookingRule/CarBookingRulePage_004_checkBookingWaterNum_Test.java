package com.wymall.test.testcases.PakringOperation.UpgradeService.carBookingRule;

import org.testng.annotations.Test;
import com.wymall.test.base.BaseParpare;
import com.wymall.test.utils.SuperAction;

public class CarBookingRulePage_004_checkBookingWaterNum_Test extends BaseParpare {
    @Test
    public void checkBookingWaterNum() {
        SuperAction.parseExcel("PakringOperation/UpgradeService/CarBookingRule", "004_checkBookingWaterNum", seleniumUtil);
    }
}