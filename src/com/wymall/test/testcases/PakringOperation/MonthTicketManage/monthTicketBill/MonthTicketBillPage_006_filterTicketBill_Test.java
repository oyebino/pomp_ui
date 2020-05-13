package com.wymall.test.testcases.PakringOperation.MonthTicketManage.monthTicketBill;

import org.testng.annotations.Test;
import com.wymall.test.base.BaseParpare;
import com.wymall.test.utils.SuperAction;

public class MonthTicketBillPage_006_filterTicketBill_Test extends BaseParpare {
    @Test
    public void filterTicketBill() {
        SuperAction.parseExcel("PakringOperation/MonthTicketManage/MonthTicketBill", "006_filterTicketBill", seleniumUtil);
    }
}