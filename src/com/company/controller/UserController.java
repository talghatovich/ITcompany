package com.company.controller;

import com.company.employees.Employee;
import com.company.repositorie.interfaces.IUserRepository;

import java.util.List;

public class UserController {


    private final IUserRepository repository;



    public UserController(IUserRepository repository) {
        this.repository=repository;
    }

    public String createEmployee(String name, String gender, String dateOfBirth, String email, int salary, String startDate){
        Employee employee = new Employee(name, gender, dateOfBirth, email,salary,startDate);

        boolean created =repository.createEmployee(employee);

        return (created ? "The employee was created!":"The creation was failed!");
    }

    public String getEmployee(int id){
        Employee employee = repository.getEmployee(id);

        return(employee == null ? "Employee was not found!": employee.toString());
    }

    public String getAllEmployees(){
        List<Employee> employeeList=repository.getAllEmployee();

        return employeeList.toString();
    }

    public String hireEmployee(String name, String gender, String dateOfBirth, String email, int salary, String startDate){
        Employee employee = new Employee(name, gender, dateOfBirth, email,salary,startDate);

        boolean created =repository.createEmployee(employee);

        return (created ? "The employee was hired!":"The employee was not hired!");
    }

}
