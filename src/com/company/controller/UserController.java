package com.company.controller;

//importing classes
import com.company.employees.Employee;
import com.company.repositorie.interfaces.IUserRepository;
import java.util.List;

public class UserController {

    //creating object of repository class
    private final IUserRepository repository;


    //constructor that accepts repository object
    public UserController(IUserRepository repository) {
        this.repository=repository;
    }

    //method that helps to create employee in dbms and accepts listed values
    public String createEmployee(String name, String gender, String dateOfBirth, String email, int salary, String startDate){
        Employee employee = new Employee(name, gender, dateOfBirth, email,salary,startDate);
        boolean created =repository.createEmployee(employee);
        return (created ? "The employee was created!" : "The creation was failed!");
    }

    //method helps to get information about employee
    public String getEmployee(int id){
        Employee employee = repository.getEmployee(id);
        return(employee == null ? "Employee was not found!": employee.toString());
    }

    //method that helps to get information of all employees
    public String getAllEmployees(){
        List<Employee> employeeList=repository.getAllEmployee();
        return employeeList.toString();
    }

    //method that counts cost
    public String countTotalCost(){
        int cost = repository.countTotalCost();
        System.out.println(cost);
        return null;
    }

    //some method that is actually useless in this case, but created for concept
    public String hireEmployee(String name, String gender, String dateOfBirth, String email, int salary, String startDate){
        Employee employee = new Employee(name, gender, dateOfBirth, email,salary,startDate);

        boolean created =repository.createEmployee(employee);

        return (created ? "The employee was hired!":"The employee was not hired!");
    }

}
