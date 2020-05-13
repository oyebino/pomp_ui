package com.wymall.test.testcases.PakringOperation.MonthTicketManage.monthTicketManager;

import org.testng.annotations.Test;
import com.wymall.test.base.BaseParpare;
import com.wymall.test.utils.SuperAction;

public class MonthTicketManagerPage_010_updateInformation_Test extends BaseParpare {
    @Test
    public void updateInformation() {
        SuperAction.parseExcel("PakringOperation/MonthTicketManage/MonthTicketManager", "010_updateInformation", seleniumUtil);
    }
}