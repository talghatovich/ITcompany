package com.company.employees.developers;

import com.company.employees.Employee;

public class SeniorDeveloper extends Employee {
    //constructor that accepts information about employee except enddate
    public SeniorDeveloper(String name, String gender, String dateOfBirth, String email, int salary, String startDate) {
        super(name, gender, dateOfBirth, email, salary, startDate);
    }
    //constructor that acceps all information about employee
    public SeniorDeveloper(String name, String gender, String dateOfBirth, String email, int salary, String startDate, String endDate) {
        super(name, gender, dateOfBirth, email, salary, startDate,endDate);
    }
}
