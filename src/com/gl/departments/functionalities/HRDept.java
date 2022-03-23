package com.gl.departments.functionalities;

public class HRDept extends SuperDept{

    // methods for HR department
    public String departmentName(){
        return "HR Department";
    }

    public String getTodaysWork(){
        return "Fill today’s worksheet and mark your attendance";
    }

    public String getWorkDeadline(){
        return "Complete by EOD";
    }

    public String doActivity(){
        return "Team Lunch";
    }

    // method that displays all the functionalities
    public void displayFunctionalities (){
        System.out.println(this.doActivity());
        System.out.println(this.getTodaysWork());
        System.out.println(this.getWorkDeadline());
        System.out.println(this.isTodayAHoliday());
    }
}
