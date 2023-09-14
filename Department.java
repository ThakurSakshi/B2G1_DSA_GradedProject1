package com.admindepartment;

import com.hrdepartment.HrDepartment;
import com.techdepartment.TechDepartment;

public class Department {

    public static void main(String[] args) {

        // Create an object of SuperDepartment class
        SuperDepartment superDept = new SuperDepartment();
        System.out.println("Welcome to " + superDept.departmentName());
        System.out.println(superDept.getTodaysWork());
        System.out.println(superDept.getWorkDeadline());
        System.out.println(superDept.isTodayAHoliday());

        // Create objects of other department classes and display their functionalities
        AdminDepartment admin = new AdminDepartment();
        System.out.println("Welcome to " + admin.departmentName());
        System.out.println(admin.getTodaysWork());
        System.out.println(admin.getWorkDeadline());
        System.out.println(admin.isTodayAHoliday());

        HrDepartment hr = new HrDepartment();
        System.out.println("Welcome to " + hr.departmentName());
        System.out.println(hr.getTodaysWork());
        System.out.println(hr.getWorkDeadline());
        System.out.println(hr.isTodayAHoliday());
        System.out.println(hr.doActivity()); // HrDepartment-specific method

        TechDepartment tech = new TechDepartment();
        System.out.println("Welcome to " + tech.departmentName());
        System.out.println(tech.getTodaysWork());
        System.out.println(tech.getWorkDeadline());
        System.out.println(tech.getTechStackInformation()); // TechDepartment-specific method
        System.out.println(tech.isTodayAHoliday());
    }
}
