package com.wymall.test.testcases.PakringOperation.CarTypeManage.carTypeManage;

import org.testng.annotations.Test;
import com.wymall.test.base.BaseParpare;
import com.wymall.test.utils.SuperAction;

public class CarTypeManagePage_012_updateInformation_Test extends BaseParpare {
    @Test
    public void updateInformation() {
        SuperAction.parseExcel("PakringOperation/CarTypeManage/CarTypeManage", "012_updateInformation", seleniumUtil);
    }
}