package com.wymall.test.testcases.PakringOperation.UpgradeService.setVoucher;

import org.testng.annotations.Test;
import com.wymall.test.base.BaseParpare;
import com.wymall.test.utils.SuperAction;

public class SetVoucherPage_001_addPayVoucher_Test extends BaseParpare {
    @Test
    public void addPayVoucher() {
        SuperAction.parseExcel("PakringOperation/UpgradeService/SetVoucher", "001_addPayVoucher", seleniumUtil);
    }
}