package com.wymall.test.testcases.PakringOperation.MonthTicketManage.monthTicketBill;

import org.testng.annotations.Test;
import com.wymall.test.base.BaseParpare;
import com.wymall.test.utils.SuperAction;

public class MonthTicketBillPage_009_checkTicketBillDetail_Test extends BaseParpare {
    @Test
    public void checkTicketBillDetail() {
        SuperAction.parseExcel("PakringOperation/MonthTicketManage/MonthTicketBill", "009_checkTicketBillDetail", seleniumUtil);
    }
}