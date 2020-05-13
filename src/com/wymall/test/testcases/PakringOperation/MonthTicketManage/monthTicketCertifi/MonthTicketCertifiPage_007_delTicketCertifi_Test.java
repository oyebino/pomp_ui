package com.wymall.test.testcases.PakringOperation.MonthTicketManage.monthTicketCertifi;

import org.testng.annotations.Test;
import com.wymall.test.base.BaseParpare;
import com.wymall.test.utils.SuperAction;

public class MonthTicketCertifiPage_007_delTicketCertifi_Test extends BaseParpare {
    @Test
    public void delTicketCertifi() {
        SuperAction.parseExcel("PakringOperation/MonthTicketManage/MonthTicketCertifi", "007_delTicketCertifi", seleniumUtil);
    }
}