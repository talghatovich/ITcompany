package com.company.employees.chiefs;

import com.company.employees.Employee;

public class COO extends Employee {
    public COO() {
    }

    public COO(String name, String gender, String dateOfBirth, String email, int salary, String startDate){
        super(name, gender, dateOfBirth, email, salary,startDate);
    }
    public COO(String name, String gender, String dateOfBirth, String email, int salary, String startDate, String endDate){
        super(name, gender, dateOfBirth, email, salary,startDate, endDate);
    }

    public void makeReportCEO(){
        System.out.println("The report have been made");
    }
    public void handleInternalAffair(){
        System.out.println("The Internal Affair have been handled");
    }
}
