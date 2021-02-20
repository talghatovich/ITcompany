package com.company.employees.developers;
//importing class
import com.company.employees.Employee;

public class JuniorDeveloper extends Employee {
    //constructor that acceps all information about employee
    public JuniorDeveloper(String name, String gender, String dateOfBirth, String email, int salary, String startDate, String endDate) {
        super(name, gender, dateOfBirth, email, salary, startDate, endDate);
    }
    //constructor that accepts information about employee except enddate
    public JuniorDeveloper(String name, String gender, String dateOfBirth, String email, int salary, String startDate) {
        super(name, gender, dateOfBirth, email, salary, startDate);
    }
}
