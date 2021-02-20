package com.company.data.interfaces;

import com.company.data.interfaces.IDB;
//importing classes
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class PostgresDB implements IDB {
    //overriding object that throws exceptions connected with SQL and if the class is not found
    @Override
    public Connection getConnection() throws SQLException, ClassNotFoundException {
        String connectionUrl = "jdbc:postgresql://localhost:5432/newBase";//inputting the adress of DB
        try {//block try that tries the block of code below
            Class.forName("org.postgresql.Driver");//returns class with the name provided

            //creating object con that gets access to DBMS
            Connection con = DriverManager.getConnection(connectionUrl, "postgres", "1234567898");

            return con;
        }catch (Exception e){//catching exception
            System.out.println(e);//showing that exception
            throw e;//throwing it
        }
    }
}