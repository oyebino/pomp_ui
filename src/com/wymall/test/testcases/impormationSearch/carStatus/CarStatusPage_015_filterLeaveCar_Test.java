package com.wymall.test.testcases.impormationSearch.carStatus;

import org.testng.annotations.Test;
import com.wymall.test.base.BaseParpare;
import com.wymall.test.utils.SuperAction;

public class CarStatusPage_015_filterLeaveCar_Test extends BaseParpare {
    @Test
    public void filterLeaveCar() {
        SuperAction.parseExcel("impormationSearch/CarStatus", "015_filterLeaveCar", seleniumUtil);
    }
}