package com.company.employees.managers;

import com.company.employees.Employee;

public class ProgramManager extends Employee {
    public ProgramManager() {
    }

    public ProgramManager(String name, String gender, String dateOfBirth, String email, int salary, String startDate, String endDate) {
        super(name, gender, dateOfBirth, email, salary, startDate, endDate);
    }

    public ProgramManager(String name, String gender, String dateOfBirth, String email, int salary, String startDate) {
        super(name, gender, dateOfBirth, email, salary, startDate);
    }

    public void checksProgram(){
        System.out.println("The program have been checked");
    }
}
