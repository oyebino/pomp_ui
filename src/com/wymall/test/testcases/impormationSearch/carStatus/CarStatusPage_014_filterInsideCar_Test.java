package com.wymall.test.testcases.impormationSearch.carStatus;

import org.testng.annotations.Test;
import com.wymall.test.base.BaseParpare;
import com.wymall.test.utils.SuperAction;

public class CarStatusPage_014_filterInsideCar_Test extends BaseParpare {
    @Test
    public void filterInsideCar() {
        SuperAction.parseExcel("impormationSearch/CarStatus", "014_filterInsideCar", seleniumUtil);
    }
}