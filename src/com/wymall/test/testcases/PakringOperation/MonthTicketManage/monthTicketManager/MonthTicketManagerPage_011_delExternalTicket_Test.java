package com.wymall.test.testcases.PakringOperation.MonthTicketManage.monthTicketManager;

import org.testng.annotations.Test;
import com.wymall.test.base.BaseParpare;
import com.wymall.test.utils.SuperAction;

public class MonthTicketManagerPage_011_delExternalTicket_Test extends BaseParpare {
    @Test
    public void delExternalTicket() {
        SuperAction.parseExcel("PakringOperation/MonthTicketManage/MonthTicketManager", "011_delExternalTicket", seleniumUtil);
    }
}