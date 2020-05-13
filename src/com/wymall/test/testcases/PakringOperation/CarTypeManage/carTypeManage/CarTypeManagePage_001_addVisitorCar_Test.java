package com.wymall.test.testcases.PakringOperation.CarTypeManage.carTypeManage;

import org.testng.annotations.Test;
import com.wymall.test.base.BaseParpare;
import com.wymall.test.utils.SuperAction;

public class CarTypeManagePage_001_addVisitorCar_Test extends BaseParpare {
    @Test
    public void addVisitorCar() {
        SuperAction.parseExcel("PakringOperation/CarTypeManage/CarTypeManage", "001_addVisitorCar", seleniumUtil);
    }
}