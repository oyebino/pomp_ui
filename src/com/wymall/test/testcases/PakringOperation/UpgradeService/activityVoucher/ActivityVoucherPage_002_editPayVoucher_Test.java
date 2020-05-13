package com.wymall.test.testcases.PakringOperation.UpgradeService.activityVoucher;

import org.testng.annotations.Test;
import com.wymall.test.base.BaseParpare;
import com.wymall.test.utils.SuperAction;

public class ActivityVoucherPage_002_editPayVoucher_Test extends BaseParpare {
    @Test
    public void editPayVoucher() {
        SuperAction.parseExcel("PakringOperation/UpgradeService/ActivityVoucher", "002_editPayVoucher", seleniumUtil);
    }
}