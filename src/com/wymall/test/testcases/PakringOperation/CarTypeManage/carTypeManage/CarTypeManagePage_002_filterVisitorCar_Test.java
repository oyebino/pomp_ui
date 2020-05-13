package com.wymall.test.testcases.PakringOperation.CarTypeManage.carTypeManage;

import org.testng.annotations.Test;
import com.wymall.test.base.BaseParpare;
import com.wymall.test.utils.SuperAction;

public class CarTypeManagePage_002_filterVisitorCar_Test extends BaseParpare {
    @Test
    public void filterVisitorCar() {
        SuperAction.parseExcel("PakringOperation/CarTypeManage/CarTypeManage", "002_filterVisitorCar", seleniumUtil);
    }
}