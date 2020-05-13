package com.wymall.test.testcases.impormationSearch.carStatus;

import org.testng.annotations.Test;
import com.wymall.test.base.BaseParpare;
import com.wymall.test.utils.SuperAction;

public class CarStatusPage_010_exportNoSystemOpening_Test extends BaseParpare {
    @Test
    public void exportNoSystemOpening() {
        SuperAction.parseExcel("impormationSearch/CarStatus", "010_exportNoSystemOpening", seleniumUtil);
    }
}