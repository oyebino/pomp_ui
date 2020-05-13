package com.wymall.test.testcases.PakringOperation.MonthTicketManage.monthTicketManager;

import org.testng.annotations.Test;
import com.wymall.test.base.BaseParpare;
import com.wymall.test.utils.SuperAction;

public class MonthTicketManagerPage_001_addInternalTicket_Test extends BaseParpare {
    @Test
    public void addInternalTicket() {
        SuperAction.parseExcel("PakringOperation/MonthTicketManage/MonthTicketManager", "001_addInternalTicket", seleniumUtil);
    }
}