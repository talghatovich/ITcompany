package com.company;
//importing classes
import com.company.controller.UserController;
import com.company.repositorie.interfaces.IUserRepository;
import java.util.Scanner;

public class MyApplication {
    //creating object
        private final UserController controller;
        private final Scanner scanner;

        //constructor that define the objects created above
    public MyApplication(IUserRepository userRepository) {
        controller = new UserController(userRepository);
        scanner = new Scanner(System.in);
    }

    //method start that is actually more intuitive to use
    public void start() {
        //greeting and providing choose
        while (true) {
            System.out.println();
            System.out.println("Welcome to My Application");
            System.out.println("Select option:");
            System.out.println("1. Get all employees");
            System.out.println("2. Get employee by id");
            System.out.println("3. Create employee");
            System.out.println("4. Count total cost");
            System.out.println("0. Exit");
            System.out.println();
            try {//defining procedure
                System.out.print("Enter option (1-4): ");
                int option = scanner.nextInt();
                if (option == 1) {
                    getEmployeesMenu();
                } else if (option == 2) {
                    getEmployeeByIdMenu();
                } else if (option == 3) {
                    createEmployeeMenu();
                } else if (option == 4){
                    countTotalCost();
                }else{
                    break;
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
                scanner.next(); // to ignore incorrect input
            }

            System.out.println("*************************");

        }
    }



    //creating employee
    private void createEmployeeMenu() {
        System.out.println("Please enter name: ");
        String name = scanner.next();
        System.out.println("Please enter gender: ");
        String gender = scanner.next();
        System.out.println("Please enter date of birth: ");
        String dateOfBirth = scanner.next();
        System.out.println("Please enter email: ");
        String email = scanner.next();
        System.out.println("Please enter salary: ");
        int salary = scanner.nextInt();
        System.out.println("Please enter the start date:");
        String startDate = scanner.next();

        //adding the employee information in dbms
        String response = controller.createEmployee(name, gender, dateOfBirth, email,salary,startDate);
        System.out.println(response);
    }
    //procedure that gets information about employee by id
    private void getEmployeeByIdMenu() {
        //asking for id
        System.out.println("Please enter id");
        //inputting id
        int id =scanner.nextInt();
        //getting it by sending to controlled
        String response =controller.getEmployee(id);
        System.out.println(response);
    }

    //procedure that helps to get information about all employees
    private void getEmployeesMenu() {
        String response =controller.getAllEmployees();
        System.out.println(response);
    }

    //procedure that counts total cost of the company
    private void countTotalCost() {
        String cost = controller.countTotalCost();
    }


}
