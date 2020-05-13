package com.wymall.test.testcases.PakringOperation.MonthTicketManage.monthTicketBill;

import org.testng.annotations.Test;
import com.wymall.test.base.BaseParpare;
import com.wymall.test.utils.SuperAction;

public class MonthTicketBillPage_004_refundMoney_Test extends BaseParpare {
    @Test
    public void refundMoney() {
        SuperAction.parseExcel("PakringOperation/MonthTicketManage/MonthTicketBill", "004_refundMoney", seleniumUtil);
    }
}