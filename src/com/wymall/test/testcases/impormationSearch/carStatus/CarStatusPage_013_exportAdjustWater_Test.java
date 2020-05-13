package com.wymall.test.testcases.impormationSearch.carStatus;

import org.testng.annotations.Test;
import com.wymall.test.base.BaseParpare;
import com.wymall.test.utils.SuperAction;

public class CarStatusPage_013_exportAdjustWater_Test extends BaseParpare {
    @Test
    public void exportAdjustWater() {
        SuperAction.parseExcel("impormationSearch/CarStatus", "013_exportAdjustWater", seleniumUtil);
    }
}