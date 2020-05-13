package com.wymall.test.testcases.impormationSearch.carStatus;

import org.testng.annotations.Test;
import com.wymall.test.base.BaseParpare;
import com.wymall.test.utils.SuperAction;

public class CarStatusPage_009_exportAbnormalCarCome_Test extends BaseParpare {
    @Test
    public void exportAbnormalCarCome() {
        SuperAction.parseExcel("impormationSearch/CarStatus", "009_exportAbnormalCarCome", seleniumUtil);
    }
}