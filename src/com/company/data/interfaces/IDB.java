package com.company.data.interfaces;

//importing class
import java.sql.Connection;
import java.sql.SQLException;


public interface IDB {
    //creating interface object that throws listed exceptions
    Connection getConnection() throws SQLException, ClassNotFoundException;
}
