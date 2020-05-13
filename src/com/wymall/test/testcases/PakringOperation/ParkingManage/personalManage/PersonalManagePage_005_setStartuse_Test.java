package com.wymall.test.testcases.PakringOperation.ParkingManage.personalManage;

import org.testng.annotations.Test;
import com.wymall.test.base.BaseParpare;
import com.wymall.test.utils.SuperAction;

public class PersonalManagePage_005_setStartuse_Test extends BaseParpare {
    @Test
    public void setStartuse() {
        SuperAction.parseExcel("PakringOperation/ParkingManage/PersonalManage", "005_setStartuse", seleniumUtil);
    }
}