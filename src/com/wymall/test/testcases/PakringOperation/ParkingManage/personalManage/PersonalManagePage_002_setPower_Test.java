package com.wymall.test.testcases.PakringOperation.ParkingManage.personalManage;

import org.testng.annotations.Test;
import com.wymall.test.base.BaseParpare;
import com.wymall.test.utils.SuperAction;

public class PersonalManagePage_002_setPower_Test extends BaseParpare {
    @Test
    public void setPower() {
        SuperAction.parseExcel("PakringOperation/ParkingManage/PersonalManage", "002_setPower", seleniumUtil);
    }
}