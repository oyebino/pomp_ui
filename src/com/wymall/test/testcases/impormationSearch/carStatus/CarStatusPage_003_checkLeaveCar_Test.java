package com.wymall.test.testcases.impormationSearch.carStatus;

import org.testng.annotations.Test;
import com.wymall.test.base.BaseParpare;
import com.wymall.test.utils.SuperAction;

public class CarStatusPage_003_checkLeaveCar_Test extends BaseParpare {
    @Test
    public void checkLeaveCar() {
        SuperAction.parseExcel("impormationSearch/CarStatus", "003_checkLeaveCar", seleniumUtil);
    }
}