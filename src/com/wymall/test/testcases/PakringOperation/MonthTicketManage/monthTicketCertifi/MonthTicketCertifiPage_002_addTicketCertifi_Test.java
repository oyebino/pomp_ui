package com.wymall.test.testcases.PakringOperation.MonthTicketManage.monthTicketCertifi;

import org.testng.annotations.Test;
import com.wymall.test.base.BaseParpare;
import com.wymall.test.utils.SuperAction;

public class MonthTicketCertifiPage_002_addTicketCertifi_Test extends BaseParpare {
    @Test
    public void addTicketCertifi() {
        SuperAction.parseExcel("PakringOperation/MonthTicketManage/MonthTicketCertifi", "002_addTicketCertifi", seleniumUtil);
    }
}