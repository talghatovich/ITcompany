package com.company.repositorie.interfaces;

//importing classes
import com.company.data.interfaces.IDB;
import com.company.employees.Employee;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserRepository implements IUserRepository {
    //creating object of IDB interface
    private final IDB db;
    //constructor that accepts object of interface
    public UserRepository(IDB db) {
        this.db = db;
    }


    //method that have been overrided from interface of repository and it creates employee in dbms
    @Override
    public boolean createEmployee(Employee employee) {
        Connection con =null;
        try {
            con = db.getConnection();
            String sql ="INSERT INTO employee(name, gender, dateofbirth, email, salary, startdate) VALUES (?,?,?,?,?,?)";
            PreparedStatement statement = con.prepareStatement(sql);
            statement.setString(1, employee.getName());
            statement.setString(2, employee.getGender());
            statement.setString(3, employee.getDateOfBirth());
            statement.setString(4, employee.getEmail());
            statement.setInt(5, employee.getSalary());
            statement.setString(6,employee.getStartDate());
            boolean executed = statement.execute();
            return executed;
        }catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }finally {
            try {
                con.close();
            }catch (SQLException throwables){
                throwables.printStackTrace();
            }
        }
        return false;
    }


    //another method that also have been overrided from interface repository and gets information about particular employee
    @Override
    public Employee getEmployee(int id) {
        Connection con = null;
        try {
            con = db.getConnection();

            String sql = "SELECT name,gender,dateofbirth, email, salary, startdate FROM employee WHERE id=?";
            PreparedStatement st = con.prepareStatement(sql);
            st.setInt(1, id);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                Employee employee = new Employee(rs.getString("name"),
                        rs.getString("gender"),
                        rs.getString("dateofbirth"),
                        rs.getString("email"),
                        rs.getInt("salary"),
                        rs.getString("startdate")
                );

                return employee;
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                con.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        return null;
    }

    //overrided method from the same place that gets information about all employees
    @Override
    public List<Employee> getAllEmployee() {
        Connection con = null;
        try {
            con = db.getConnection();
            String sql ="SELECT id,name,gender,dateofbirth,email,salary,startdate FROM employee";
            Statement st = con.createStatement();

            ResultSet rs = st.executeQuery(sql);
            List<Employee> employees = new ArrayList<>();
            while (rs.next()){
                Employee employee = new Employee(rs.getString("name"),
                        rs.getString("gender"),
                        rs.getString("dateofbirth"),
                        rs.getString("email"),
                        rs.getInt("salary"),
                        rs.getString("startdate"));
                employees.add(employee);
            }
            return employees;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }finally {
            try {
                con.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }

        return null;
    }

    //method that counts cost
    @Override
    public int countTotalCost() {
        Connection con = null;

        try {
            con = db.getConnection();
            String sql =  "SELECT SUM(salary) AS totalcost FROM employee";
            Statement st = con.createStatement();

            ResultSet rs = st.executeQuery(sql);


            if(rs.next()){
                int cost = rs.getInt("totalcost");
                System.out.println(cost + " $");
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }finally {
            try {
                con.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }


        return 1;
    }
}
