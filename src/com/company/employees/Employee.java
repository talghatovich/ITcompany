/*The class is the parent class from which subclasses inherit fields and methods*/
package com.company.employees;


public class Employee{
    //declaring fields for employees
    private int id;
    private static int id_gen=0;
    private String Name;
    private String gender;
    private String dateOfBirth;
    private String email;
    private int salary;
    private String startDate;
    private String endDate;

    //


    //example and general method for all employee if they made something great
    public boolean madeGreat(){
        System.out.println("The employee made something great!");
        return true;
    }

    //constructor that accepts only id
    public Employee(int id) {
        this.id = id;
    }

    //the opposite method to madegreat
    public boolean madeBad(){
        System.out.println("The employee made bad!");
        return true;
    }

    //constructor that accepts all methods
    public Employee(String name, String gender, String dateOfBirth, String email, int salary, String startDate, String endDate) {

        id = id_gen++;
        Name = name;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.email = email;
        this.salary = salary;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    //constructor that accepts all methods excluding enddate
    public Employee(String name, String gender, String dateOfBirth, String email, int salary, String startDate) {
        id = id_gen++;
        Name = name;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.email = email;
        this.salary = salary;
        this.startDate = startDate;
    }

    //method that checks if employee is fits requirements(amount of skills)
    public static boolean isGoodEmployee(int skills){
        if(skills>5){
            return true;
        }else{
            return false;
        }
    }

    //getters for all fields
    public int getId() {
        return id;
    }
    public static int getId_gen() {
        return id_gen;
    }
    public String getName() {
        return Name;
    }
    public String getGender() {
        return gender;
    }
    public String getDateOfBirth() {
        return dateOfBirth;
    }
    public String getEmail() {
        return email;
    }
    public int getSalary() {
        return salary;
    }
    public String getStartDate() {
        return startDate;
    }
    public String getEndDate() {
        return endDate;
    }

    //setters for all fields
    public void setId(int id) {
        this.id = id;
    }
    public static void setId_gen(int id_gen) {
        Employee.id_gen = id_gen;
    }
    public void setName(String name) {
        Name = name;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }
    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    //method that displays the values of fields
    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", Name='" + Name + '\'' +
                ", gender='" + gender + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", email='" + email + '\'' +
                ", salary=" + salary +
                ", startDate='" + startDate + '\'' +
                ", endDate='" + endDate + '\'' +
                '}';
    }

}
