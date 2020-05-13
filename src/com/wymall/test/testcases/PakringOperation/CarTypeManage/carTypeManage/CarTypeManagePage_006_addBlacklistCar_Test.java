package com.wymall.test.testcases.PakringOperation.CarTypeManage.carTypeManage;

import org.testng.annotations.Test;
import com.wymall.test.base.BaseParpare;
import com.wymall.test.utils.SuperAction;

public class CarTypeManagePage_006_addBlacklistCar_Test extends BaseParpare {
    @Test
    public void addBlacklistCar() {
        SuperAction.parseExcel("PakringOperation/CarTypeManage/CarTypeManage", "006_addBlacklistCar", seleniumUtil);
    }
}