package com.wymall.test.testcases.PakringOperation.MonthTicketManage.monthTicketCertifi;

import org.testng.annotations.Test;
import com.wymall.test.base.BaseParpare;
import com.wymall.test.utils.SuperAction;

public class MonthTicketCertifiPage_001_saveRuleManager_Test extends BaseParpare {
    @Test
    public void saveRuleManager() {
        SuperAction.parseExcel("PakringOperation/MonthTicketManage/MonthTicketCertifi", "001_saveRuleManager", seleniumUtil);
    }
}