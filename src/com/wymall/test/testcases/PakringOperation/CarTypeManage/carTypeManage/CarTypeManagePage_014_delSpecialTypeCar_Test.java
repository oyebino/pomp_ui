package com.wymall.test.testcases.PakringOperation.CarTypeManage.carTypeManage;

import org.testng.annotations.Test;
import com.wymall.test.base.BaseParpare;
import com.wymall.test.utils.SuperAction;

public class CarTypeManagePage_014_delSpecialTypeCar_Test extends BaseParpare {
    @Test
    public void delSpecialTypeCar() {
        SuperAction.parseExcel("PakringOperation/CarTypeManage/CarTypeManage", "014_delSpecialTypeCar", seleniumUtil);
    }
}