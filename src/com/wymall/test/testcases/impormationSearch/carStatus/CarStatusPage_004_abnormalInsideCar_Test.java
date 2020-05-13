package com.wymall.test.testcases.impormationSearch.carStatus;

import org.testng.annotations.Test;
import com.wymall.test.base.BaseParpare;
import com.wymall.test.utils.SuperAction;

public class CarStatusPage_004_abnormalInsideCar_Test extends BaseParpare {
    @Test
    public void abnormalInsideCar() {
        SuperAction.parseExcel("impormationSearch/CarStatus", "004_abnormalInsideCar", seleniumUtil);
    }
}