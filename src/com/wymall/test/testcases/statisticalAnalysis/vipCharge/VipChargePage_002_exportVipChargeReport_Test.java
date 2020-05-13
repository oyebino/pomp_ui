package com.wymall.test.testcases.statisticalAnalysis.vipCharge;

import org.testng.annotations.Test;
import com.wymall.test.base.BaseParpare;
import com.wymall.test.utils.SuperAction;

public class VipChargePage_002_exportVipChargeReport_Test extends BaseParpare {
    @Test
    public void exportVipChargeReport() {
        SuperAction.parseExcel("statisticalAnalysis/VipCharge", "002_exportVipChargeReport", seleniumUtil);
    }
}