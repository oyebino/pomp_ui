package com.wymall.test.testcases.PakringOperation.MonthTicketManage.monthTicketManager;

import org.testng.annotations.Test;
import com.wymall.test.base.BaseParpare;
import com.wymall.test.utils.SuperAction;

public class MonthTicketManagerPage_004_delInternalTicket_Test extends BaseParpare {
    @Test
    public void delInternalTicket() {
        SuperAction.parseExcel("PakringOperation/MonthTicketManage/MonthTicketManager", "004_delInternalTicket", seleniumUtil);
    }
}