package com.wymall.test.testcases.impormationSearch.carStatus;

import org.testng.annotations.Test;
import com.wymall.test.base.BaseParpare;
import com.wymall.test.utils.SuperAction;

public class CarStatusPage_002_checkChargeBill_Test extends BaseParpare {
    @Test
    public void checkChargeBill() {
        SuperAction.parseExcel("impormationSearch/CarStatus", "002_checkChargeBill", seleniumUtil);
    }
}