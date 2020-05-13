package com.wymall.test.testcases.PakringOperation.UpgradeService.useRecord;

import org.testng.annotations.Test;
import com.wymall.test.base.BaseParpare;
import com.wymall.test.utils.SuperAction;

public class UseRecordPage_001_exportUseRecord_Test extends BaseParpare {
    @Test
    public void exportUseRecord() {
        SuperAction.parseExcel("PakringOperation/UpgradeService/UseRecord", "001_exportUseRecord", seleniumUtil);
    }
}