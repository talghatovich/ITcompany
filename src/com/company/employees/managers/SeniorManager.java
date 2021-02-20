package com.company.employees.managers;

import com.company.employees.Employee;

public class SeniorManager extends Employee {
    public SeniorManager() {
    }

    public SeniorManager(String name, String gender, String dateOfBirth, String email, int salary, String startDate, String endDate) {
        super(name, gender, dateOfBirth, email, salary, startDate, endDate);
    }

    public SeniorManager(String name, String gender, String dateOfBirth, String email, int salary, String startDate) {
        super(name, gender, dateOfBirth, email, salary, startDate);
    }
}
