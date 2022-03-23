package com.gl.departments.functionalities;

public class TechDept extends SuperDept{

    // methods for Tech department
    public String departmentName(){
        return "Tech Department";
    }

    public String getTodaysWork(){
        return "Complete coding of module 1";
    }

    public String getWorkDeadline(){
        return "Complete by EOD";
    }

    public String getTechStackInformation(){
        return "Core Java";
    }

    // method that displays all the functionalities
    public void displayFunctionalities(){
        System.out.println(this.getTodaysWork());
        System.out.println(this.getWorkDeadline());
        System.out.println(this.getTechStackInformation());
        System.out.println(this.isTodayAHoliday());
    }
}
