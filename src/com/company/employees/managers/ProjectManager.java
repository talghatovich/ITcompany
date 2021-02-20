package com.company.employees.managers;

import com.company.employees.Employee;

public class ProjectManager extends Employee {
    public ProjectManager() {
    }

    public ProjectManager(String name, String gender, String dateOfBirth, String email, int salary, String startDate, String endDate) {
        super(name, gender, dateOfBirth, email, salary, startDate, endDate);
    }

    public ProjectManager(String name, String gender, String dateOfBirth, String email, int salary, String startDate) {
        super(name, gender, dateOfBirth, email, salary, startDate);
    }
}
