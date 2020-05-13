package com.wymall.test.testcases.PakringOperation.UpgradeService.useRecord;

import org.testng.annotations.Test;
import com.wymall.test.base.BaseParpare;
import com.wymall.test.utils.SuperAction;

public class UseRecordPage_002_checkUseRecord_Test extends BaseParpare {
    @Test
    public void checkUseRecord() {
        SuperAction.parseExcel("PakringOperation/UpgradeService/UseRecord", "002_checkUseRecord", seleniumUtil);
    }
}