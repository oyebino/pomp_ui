package com.wymall.test.testcases.PakringOperation.MonthTicketManage.monthTicketBill;

import org.testng.annotations.Test;
import com.wymall.test.base.BaseParpare;
import com.wymall.test.utils.SuperAction;

public class MonthTicketBillPage_012_exporStoreValueChargeRecord_Test extends BaseParpare {
    @Test
    public void exporStoreValueChargeRecord() {
        SuperAction.parseExcel("PakringOperation/MonthTicketManage/MonthTicketBill", "012_exporStoreValueChargeRecord", seleniumUtil);
    }
}