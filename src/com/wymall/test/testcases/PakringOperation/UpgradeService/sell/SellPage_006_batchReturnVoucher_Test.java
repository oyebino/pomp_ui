package com.wymall.test.testcases.PakringOperation.UpgradeService.sell;

import org.testng.annotations.Test;
import com.wymall.test.base.BaseParpare;
import com.wymall.test.utils.SuperAction;

public class SellPage_006_batchReturnVoucher_Test extends BaseParpare {
    @Test
    public void batchReturnVoucher() {
        SuperAction.parseExcel("PakringOperation/UpgradeService/Sell", "006_batchReturnVoucher", seleniumUtil);
    }
}