package com.gl.functionalitiesGeneration;
import com.gl.departments.functionalities.*;

public class MainClass {

    // printing welcome statement for each department
    private void welcome(SuperDept dept){
        System.out.println("Welcome to "+dept.departmentName());
    }

    // display function for each department
    private void deptFunctionsDisplay (SuperDept dept){
        welcome(dept);
        dept.displayFunctionalities();
        System.out.println();
    }

    // main class that drives all objects
    public static void main(String[] args) {
        MainClass mainDriver= new MainClass();

        // display for admin department
        AdminDept admin= new AdminDept();
        mainDriver.deptFunctionsDisplay(admin);

        //display for HR department
        HRDept hr= new HRDept();
        mainDriver.deptFunctionsDisplay(hr);

        //display for tech department
        TechDept tech= new TechDept();
        mainDriver.deptFunctionsDisplay(tech);
    }
}
