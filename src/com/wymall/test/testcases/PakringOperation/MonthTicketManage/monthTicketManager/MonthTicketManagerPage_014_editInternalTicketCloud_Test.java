package com.wymall.test.testcases.PakringOperation.MonthTicketManage.monthTicketManager;

import org.testng.annotations.Test;
import com.wymall.test.base.BaseParpare;
import com.wymall.test.utils.SuperAction;

public class MonthTicketManagerPage_014_editInternalTicketCloud_Test extends BaseParpare {
    @Test
    public void editInternalTicketCloud() {
        SuperAction.parseExcel("PakringOperation/MonthTicketManage/MonthTicketManager", "014_editInternalTicketCloud", seleniumUtil);
    }
}