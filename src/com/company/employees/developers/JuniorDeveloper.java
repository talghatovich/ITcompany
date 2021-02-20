package com.company.employees.developers;

import com.company.employees.Employee;

public class JuniorDeveloper extends Employee {
    public JuniorDeveloper() {
    }

    public JuniorDeveloper(String name, String gender, String dateOfBirth, String email, int salary, String startDate, String endDate) {
        super(name, gender, dateOfBirth, email, salary, startDate, endDate);
    }

    public JuniorDeveloper(String name, String gender, String dateOfBirth, String email, int salary, String startDate) {
        super(name, gender, dateOfBirth, email, salary, startDate);
    }
}
