package com.company;

import com.company.controller.UserController;
import com.company.repositorie.interfaces.IUserRepository;

import java.util.Scanner;

public class MyApplication {
        private final UserController controller;

        private final Scanner scanner;

    public MyApplication(IUserRepository userRepository) {
        controller = new UserController(userRepository);
        scanner = new Scanner(System.in);
    }

    public void start() {
        while (true) {
            System.out.println();
            System.out.println("Welcome to My Application");
            System.out.println("Select option:");
            System.out.println("1. Get all employees");
            System.out.println("2. Get employee by id");
            System.out.println("3. Create employee");
            System.out.println("0. Exit");
            System.out.println();
            try {
                System.out.print("Enter option (1-3): ");
                int option = scanner.nextInt();
                if (option == 1) {
                    getEmployeesMenu();
                } else if (option == 2) {
                    getEmployeeByIdMenu();
                } else if (option == 3) {
                    createEmployeeMenu();
                } else {
                    break;
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
                scanner.next(); // to ignore incorrect input
            }

            System.out.println("*************************");

        }
    }

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

        String response = controller.createEmployee(name, gender, dateOfBirth, email,salary,startDate);
        System.out.println(response);


    }

    private void getEmployeeByIdMenu() {
        System.out.println("Please enter id");

        int id =scanner.nextInt();
        String response =controller.getEmployee(id);
        System.out.println(response);
    }

    private void getEmployeesMenu() {
        String response =controller.getAllEmployees();
        System.out.println(response);
    }


}
