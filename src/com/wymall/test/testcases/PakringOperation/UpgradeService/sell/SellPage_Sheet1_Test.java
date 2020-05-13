package com.wymall.test.testcases.PakringOperation.UpgradeService.sell;

import org.testng.annotations.Test;
import com.wymall.test.base.BaseParpare;
import com.wymall.test.utils.SuperAction;

public class SellPage_Sheet1_Test extends BaseParpare {
    @Test
    public void sheet1() {
        SuperAction.parseExcel("PakringOperation/UpgradeService/Sell", "Sheet1", seleniumUtil);
    }
}