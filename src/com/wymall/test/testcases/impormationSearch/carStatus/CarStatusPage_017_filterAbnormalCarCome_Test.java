package com.wymall.test.testcases.impormationSearch.carStatus;

import org.testng.annotations.Test;
import com.wymall.test.base.BaseParpare;
import com.wymall.test.utils.SuperAction;

public class CarStatusPage_017_filterAbnormalCarCome_Test extends BaseParpare {
    @Test
    public void filterAbnormalCarCome() {
        SuperAction.parseExcel("impormationSearch/CarStatus", "017_filterAbnormalCarCome", seleniumUtil);
    }
}