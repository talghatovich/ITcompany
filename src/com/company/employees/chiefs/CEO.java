package com.company.employees.chiefs;

//importing class
import com.company.employees.Employee;

public class CEO extends Employee {
    //constructor that accepts information about employee except enddate
    public CEO(String name, String gender, String dateOfBirth, String email, int salary, String startDate){
        super(name, gender, dateOfBirth, email, salary,startDate);
    }

    //constructor that acceps all information about employee
    public CEO(String name, String gender, String dateOfBirth, String email, int salary, String startDate, String endDate){
        super(name, gender, dateOfBirth, email, salary,startDate, endDate);
    }

    //some method that has usage in a context of IT company
    public boolean signContract(){
        System.out.println("Contract is signed");
        return true;
    }

    //some method that has usage in a context of IT company
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
