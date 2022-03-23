package com.gl.departments.functionalities;

public class AdminDept extends SuperDept{

    // methods for Admin department
    public String departmentName(){
        return "Admin Department";
    }

    public String getTodaysWork(){
        return "Complete your documents submission";
    }

    public String getWorkDeadline(){
        return "Complete by EOD";
    }

    // method that displays all the functionalities
    public void displayFunctionalities(){
        System.out.println(this.getTodaysWork());
        System.out.println(this.getWorkDeadline());
        System.out.println(this.isTodayAHoliday());
    }
}
