package com.company.employees.chiefs;
//importing class
import com.company.employees.Employee;

public class COO extends Employee {
    //constructor that accepts information about employee except enddate
    public COO(String name, String gender, String dateOfBirth, String email, int salary, String startDate){
        super(name, gender, dateOfBirth, email, salary,startDate);
    }
    //constructor that acceps all information about employee
    public COO(String name, String gender, String dateOfBirth, String email, int salary, String startDate, String endDate){
        super(name, gender, dateOfBirth, email, salary,startDate, endDate);
    }

    //some method that has usage in a context of IT company
    public void makeReportCEO(){
        System.out.println("The report have been made");
    }

    //some method that has usage in a context of IT company
    public void handleInternalAffair(){
        System.out.println("The Internal Affair have been handled");
    }
}
