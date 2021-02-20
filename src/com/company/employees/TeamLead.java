package com.company.employees;

public class TeamLead extends Employee {


    public TeamLead(String name, String gender, String dateOfBirth, String email, int salary, String startDate) {
        super(name, gender, dateOfBirth, email, salary, startDate);
    }

    public TeamLead(String name, String gender, String dateOfBirth, String email, int salary, String startDate, String endDate) {
        super(name, gender, dateOfBirth, email, salary, startDate, endDate);
    }

    public TeamLead() {
    }
}
