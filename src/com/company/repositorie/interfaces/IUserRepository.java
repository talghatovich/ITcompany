package com.company.repositorie.interfaces;
//importing classes
import com.company.employees.Employee;
import java.util.List;

public interface IUserRepository {
    //interface methods
    boolean createEmployee(Employee employee);
    Employee getEmployee(int id);
    List<Employee> getAllEmployee();
    int countTotalCost();
}
