package com.company.employees.managers;
//importing class
import com.company.employees.Employee;

public class ProgramManager extends Employee {
    //constructor that acceps all information about employee
    public ProgramManager(String name, String gender, String dateOfBirth, String email, int salary, String startDate, String endDate) {
        super(name, gender, dateOfBirth, email, salary, startDate, endDate);
    }
    //constructor that accepts information about employee except enddate
    public ProgramManager(String name, String gender, String dateOfBirth, String email, int salary, String startDate) {
        super(name, gender, dateOfBirth, email, salary, startDate);
    }
    //method for context
    public void checksProgram(){
        System.out.println("The program have been checked");
    }
}
