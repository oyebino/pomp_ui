package com.wymall.test.testcases.PakringOperation.CarTypeManage.carTypeManage;

import org.testng.annotations.Test;
import com.wymall.test.base.BaseParpare;
import com.wymall.test.utils.SuperAction;

public class CarTypeManagePage_003_editVisitorCar_Test extends BaseParpare {
    @Test
    public void editVisitorCar() {
        SuperAction.parseExcel("PakringOperation/CarTypeManage/CarTypeManage", "003_editVisitorCar", seleniumUtil);
    }
}