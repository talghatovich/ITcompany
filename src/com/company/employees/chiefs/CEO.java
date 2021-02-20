package com.company.employees.chiefs;

import com.company.employees.Employee;

public class CEO extends Employee {

    public CEO() {

    }
    public CEO(String name, String gender, String dateOfBirth, String email, int salary, String startDate){
        super(name, gender, dateOfBirth, email, salary,startDate);
    }

    public CEO(String name, String gender, String dateOfBirth, String email, int salary, String startDate, String endDate){
        super(name, gender, dateOfBirth, email, salary,startDate, endDate);
    }


    public boolean signContract(){
        System.out.println("Contract is signed");
        return true;
    }

    public boolean makeAnImportantStep(boolean stepBringsMoney){
        if(stepBringsMoney==true){
            System.out.println("The step have been made");
            return true;
        }else{
            System.out.println("The step have not been made");
            return false;
        }

    }
}
