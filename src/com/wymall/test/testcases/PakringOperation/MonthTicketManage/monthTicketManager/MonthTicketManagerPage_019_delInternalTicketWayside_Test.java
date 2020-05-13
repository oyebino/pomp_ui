package com.wymall.test.testcases.PakringOperation.MonthTicketManage.monthTicketManager;

import org.testng.annotations.Test;
import com.wymall.test.base.BaseParpare;
import com.wymall.test.utils.SuperAction;

public class MonthTicketManagerPage_019_delInternalTicketWayside_Test extends BaseParpare {
    @Test
    public void delInternalTicketWayside() {
        SuperAction.parseExcel("PakringOperation/MonthTicketManage/MonthTicketManager", "019_delInternalTicketWayside", seleniumUtil);
    }
}