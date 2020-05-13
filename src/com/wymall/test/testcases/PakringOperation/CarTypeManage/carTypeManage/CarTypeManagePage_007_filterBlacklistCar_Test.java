package com.wymall.test.testcases.PakringOperation.CarTypeManage.carTypeManage;

import org.testng.annotations.Test;
import com.wymall.test.base.BaseParpare;
import com.wymall.test.utils.SuperAction;

public class CarTypeManagePage_007_filterBlacklistCar_Test extends BaseParpare {
    @Test
    public void filterBlacklistCar() {
        SuperAction.parseExcel("PakringOperation/CarTypeManage/CarTypeManage", "007_filterBlacklistCar", seleniumUtil);
    }
}