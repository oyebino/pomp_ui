package com.wymall.test.testcases.PakringOperation.UpgradeService.sell;

import org.testng.annotations.Test;
import com.wymall.test.base.BaseParpare;
import com.wymall.test.utils.SuperAction;

public class SellPage_007_exportSellRecord_Test extends BaseParpare {
    @Test
    public void exportSellRecord() {
        SuperAction.parseExcel("PakringOperation/UpgradeService/Sell", "007_exportSellRecord", seleniumUtil);
    }
}