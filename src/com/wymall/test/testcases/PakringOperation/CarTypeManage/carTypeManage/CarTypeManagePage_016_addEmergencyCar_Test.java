package com.wymall.test.testcases.PakringOperation.CarTypeManage.carTypeManage;

import org.testng.annotations.Test;
import com.wymall.test.base.BaseParpare;
import com.wymall.test.utils.SuperAction;

public class CarTypeManagePage_016_addEmergencyCar_Test extends BaseParpare {
    @Test
    public void addEmergencyCar() {
        SuperAction.parseExcel("PakringOperation/CarTypeManage/CarTypeManage", "016_addEmergencyCar", seleniumUtil);
    }
}