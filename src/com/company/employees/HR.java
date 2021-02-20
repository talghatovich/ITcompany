package com.company.employees;

import com.company.controller.UserController;
import com.company.employees.chiefs.CEO;

public class HR extends Employee {

    //constructor that acceps all information about employee
    public HR(String name, String gender, String dateOfBirth, String email, int salary, String startDate){
        super(name, gender, dateOfBirth, email, salary,startDate);
    }
    //constructor that accepts information about employee except enddate
    public HR(String name, String gender, String dateOfBirth, String email, int salary, String startDate, String endDate){
        super(name, gender, dateOfBirth, email, salary,startDate, endDate);
    }

    //some method that fits in context of IT company
    public boolean hireEmployee(String employee, int numberOfSkills){
        if(Employee.isGoodEmployee(numberOfSkills)==true){
            if(employee=="CEO"){
                System.out.println("The "+employee+" have been hired");
                return true;
            }else if(employee=="COO"){
                System.out.println("The "+employee+" have been hired");
                return true;
            }else if(employee=="Junior Developer"){
                System.out.println("The "+employee+" have been hired");
                return true;
            }else if(employee=="Senior Developer"){
                System.out.println("The "+employee+" have been hired");
                return true;
            }else if(employee=="Project Manager"){
                System.out.println("The "+employee+" have been hired");
                return true;
            }else if(employee=="Program Manager"){
                System.out.println("The "+employee+" have been hired");
                return true;
            }else if(employee=="Senior Manager"){
                System.out.println("The "+employee+" have been hired");
                return true;
            }else if(employee=="HR") {
                System.out.println("The " + employee + " have been hired");
                return true;
            }else if(employee=="Team Lead"){
                System.out.println("The "+employee+" have been hired");
                return true;
            }
            return true;
        }else{
            System.out.println("The employee have not been hired");
            return false;
        }
    }

    //this method is also only for context
    public void fireEmployee(String employee){
        System.out.println("The employee "+employee+" is fired");
    };

}
