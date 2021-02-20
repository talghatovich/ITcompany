package com.company.employees.managers;

import com.company.employees.Employee;

public class ProjectManager extends Employee {
    //constructor that acceps all information about employee
    public ProjectManager(String name, String gender, String dateOfBirth, String email, int salary, String startDate, String endDate) {
        super(name, gender, dateOfBirth, email, salary, startDate, endDate);
    }
    //constructor that accepts information about employee except enddate
    public ProjectManager(String name, String gender, String dateOfBirth, String email, int salary, String startDate) {
        super(name, gender, dateOfBirth, email, salary, startDate);
    }
}
