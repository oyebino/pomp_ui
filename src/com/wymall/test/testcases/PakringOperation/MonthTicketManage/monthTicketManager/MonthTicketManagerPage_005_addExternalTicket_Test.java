package com.wymall.test.testcases.PakringOperation.MonthTicketManage.monthTicketManager;

import org.testng.annotations.Test;
import com.wymall.test.base.BaseParpare;
import com.wymall.test.utils.SuperAction;

public class MonthTicketManagerPage_005_addExternalTicket_Test extends BaseParpare {
    @Test
    public void addExternalTicket() {
        SuperAction.parseExcel("PakringOperation/MonthTicketManage/MonthTicketManager", "005_addExternalTicket", seleniumUtil);
    }
}