package com.wymall.test.testcases.PakringOperation.UpgradeService.setVoucher;

import org.testng.annotations.Test;
import com.wymall.test.base.BaseParpare;
import com.wymall.test.utils.SuperAction;

public class SetVoucherPage_002_editPayVoucher_Test extends BaseParpare {
    @Test
    public void editPayVoucher() {
        SuperAction.parseExcel("PakringOperation/UpgradeService/SetVoucher", "002_editPayVoucher", seleniumUtil);
    }
}