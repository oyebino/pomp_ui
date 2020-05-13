package com.wymall.test.testcases.PakringOperation.ParkingManage.personalManage;

import org.testng.annotations.Test;
import com.wymall.test.base.BaseParpare;
import com.wymall.test.utils.SuperAction;

public class PersonalManagePage_003_editUser_Test extends BaseParpare {
    @Test
    public void editUser() {
        SuperAction.parseExcel("PakringOperation/ParkingManage/PersonalManage", "003_editUser", seleniumUtil);
    }
}