package com.wymall.test.testcases.PakringOperation.CarTypeManage.carTypeManage;

import org.testng.annotations.Test;
import com.wymall.test.base.BaseParpare;
import com.wymall.test.utils.SuperAction;

public class CarTypeManagePage_017_setEmergencyCarWarn_Test extends BaseParpare {
    @Test
    public void setEmergencyCarWarn() {
        SuperAction.parseExcel("PakringOperation/CarTypeManage/CarTypeManage", "017_setEmergencyCarWarn", seleniumUtil);
    }
}