package com.wymall.test.testcases.PakringOperation.MonthTicketManage.monthTicketBill;

import org.testng.annotations.Test;
import com.wymall.test.base.BaseParpare;
import com.wymall.test.utils.SuperAction;

public class MonthTicketBillPage_010_checkStoreValueChargeRecord_Test extends BaseParpare {
    @Test
    public void checkStoreValueChargeRecord() {
        SuperAction.parseExcel("PakringOperation/MonthTicketManage/MonthTicketBill", "010_checkStoreValueChargeRecord", seleniumUtil);
    }
}