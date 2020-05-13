package com.wymall.test.testcases.PakringOperation.MonthTicketManage.monthTicketManager;

import org.testng.annotations.Test;
import com.wymall.test.base.BaseParpare;
import com.wymall.test.utils.SuperAction;

public class MonthTicketManagerPage_016_addInternalTicketWayside_Test extends BaseParpare {
    @Test
    public void addInternalTicketWayside() {
        SuperAction.parseExcel("PakringOperation/MonthTicketManage/MonthTicketManager", "016_addInternalTicketWayside", seleniumUtil);
    }
}