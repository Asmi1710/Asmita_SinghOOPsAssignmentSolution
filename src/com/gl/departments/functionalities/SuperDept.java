package com.gl.departments.functionalities;

public class SuperDept {

    // methods for Super department
    public String departmentName(){
        return "Super Department";
    }

    public String getTodaysWork(){
        return "No Work as of now";
    }

    public String getWorkDeadline(){
        return "Nil";
    }

    public String isTodayAHoliday(){
        return "Today is not a holiday";
    }

    // method that displays all the functionalities
    public void displayFunctionalities(){
        System.out.println (this.getTodaysWork());
        System.out.println (this.getWorkDeadline());
        System.out.println (this.isTodayAHoliday());
    }
}
