package com.company.employees.managers;

import com.company.employees.Employee;

public class SeniorManager extends Employee {
    //constructor that accepts all information about employee
    public SeniorManager(String name, String gender, String dateOfBirth, String email, int salary, String startDate, String endDate) {
        super(name, gender, dateOfBirth, email, salary, startDate, endDate);
    }
    //constructor that accepts information about employee except enddate
    public SeniorManager(String name, String gender, String dateOfBirth, String email, int salary, String startDate) {
        super(name, gender, dateOfBirth, email, salary, startDate);
    }
}
