package com.wymall.test.testcases.PakringOperation.MonthTicketManage.monthTicketManager;

import org.testng.annotations.Test;
import com.wymall.test.base.BaseParpare;
import com.wymall.test.utils.SuperAction;

public class MonthTicketManagerPage_018_editInternalTicketWayside_Test extends BaseParpare {
    @Test
    public void editInternalTicketWayside() {
        SuperAction.parseExcel("PakringOperation/MonthTicketManage/MonthTicketManager", "018_editInternalTicketWayside", seleniumUtil);
    }
}