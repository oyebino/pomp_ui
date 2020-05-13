package com.wymall.test.testcases.impormationSearch.carStatus;

import org.testng.annotations.Test;
import com.wymall.test.base.BaseParpare;
import com.wymall.test.utils.SuperAction;

public class CarStatusPage_020_filterAbnormalPhoto_Test extends BaseParpare {
    @Test
    public void filterAbnormalPhoto() {
        SuperAction.parseExcel("impormationSearch/CarStatus", "020_filterAbnormalPhoto", seleniumUtil);
    }
}