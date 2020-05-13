package com.wymall.test.testcases.PakringOperation.MonthTicketManage.monthTicketBill;

import org.testng.annotations.Test;
import com.wymall.test.base.BaseParpare;
import com.wymall.test.utils.SuperAction;

public class MonthTicketBillPage_008_batchRefundMoney_Test extends BaseParpare {
    @Test
    public void batchRefundMoney() {
        SuperAction.parseExcel("PakringOperation/MonthTicketManage/MonthTicketBill", "008_batchRefundMoney", seleniumUtil);
    }
}