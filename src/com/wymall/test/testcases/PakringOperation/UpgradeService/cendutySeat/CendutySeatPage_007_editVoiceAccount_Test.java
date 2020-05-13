package com.wymall.test.testcases.PakringOperation.UpgradeService.cendutySeat;

import org.testng.annotations.Test;
import com.wymall.test.base.BaseParpare;
import com.wymall.test.utils.SuperAction;

public class CendutySeatPage_007_editVoiceAccount_Test extends BaseParpare {
    @Test
    public void editVoiceAccount() {
        SuperAction.parseExcel("PakringOperation/UpgradeService/CendutySeat", "007_editVoiceAccount", seleniumUtil);
    }
}