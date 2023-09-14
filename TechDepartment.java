package com.techdepartment;

import com.admindepartment.SuperDepartment;

public class TechDepartment extends SuperDepartment {
    @Override
    public
    String departmentName() {
        return "Tech Department";
    }

    @Override
    public
    String getTodaysWork() {
        return "Complete coding of module 1";
    }

    @Override
    public
    String getWorkDeadline() {
        return "Complete by EOD";
    }

    // This is a unique method for TechDepartment, not an override
    
    public String getTechStackInformation() {
        return "core Java";
    }
}
