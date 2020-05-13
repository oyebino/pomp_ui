package com.wymall.test.testcases.PakringOperation.UpgradeService.cendutySeat;

import org.testng.annotations.Test;
import com.wymall.test.base.BaseParpare;
import com.wymall.test.utils.SuperAction;

public class CendutySeatPage_006_addVoiceAccount_Test extends BaseParpare {
    @Test
    public void addVoiceAccount() {
        SuperAction.parseExcel("PakringOperation/UpgradeService/CendutySeat", "006_addVoiceAccount", seleniumUtil);
    }
}