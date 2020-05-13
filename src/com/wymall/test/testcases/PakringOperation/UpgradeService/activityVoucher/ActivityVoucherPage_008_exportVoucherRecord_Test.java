package com.wymall.test.testcases.PakringOperation.UpgradeService.activityVoucher;

import org.testng.annotations.Test;
import com.wymall.test.base.BaseParpare;
import com.wymall.test.utils.SuperAction;

public class ActivityVoucherPage_008_exportVoucherRecord_Test extends BaseParpare {
    @Test
    public void exportVoucherRecord() {
        SuperAction.parseExcel("PakringOperation/UpgradeService/ActivityVoucher", "008_exportVoucherRecord", seleniumUtil);
    }
}