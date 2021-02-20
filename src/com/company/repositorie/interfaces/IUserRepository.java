package com.company.repositorie.interfaces;

import com.company.employees.Employee;

import java.util.List;

public interface IUserRepository {
    boolean createEmployee(Employee employee);
    Employee getEmployee(int id);

    List<Employee> getAllEmployee();
}
