package com.company.employees.developers;

import com.company.employees.Employee;

public class SeniorDeveloper extends Employee {
    String position;


    public SeniorDeveloper() {
    }

    public SeniorDeveloper(String position) {
        this.position = position;
    }

    public SeniorDeveloper(String name, String gender, String dateOfBirth, String email, int salary, String startDate, String position) {
        super(name, gender, dateOfBirth, email, salary, startDate);
        this.position = position;
    }

    public SeniorDeveloper(String name, String gender, String dateOfBirth, String email, int salary, String startDate, String endDate, String position) {
        super(name, gender, dateOfBirth, email, salary, startDate,endDate);
        this.position=position;
    }
}
