package com.wymall.test.testcases.PakringOperation.CarTypeManage.carTypeManage;

import org.testng.annotations.Test;
import com.wymall.test.base.BaseParpare;
import com.wymall.test.utils.SuperAction;

public class CarTypeManagePage_010_exportBlacklistCar_Test extends BaseParpare {
    @Test
    public void exportBlacklistCar() {
        SuperAction.parseExcel("PakringOperation/CarTypeManage/CarTypeManage", "010_exportBlacklistCar", seleniumUtil);
    }
}