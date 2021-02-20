package com.company;

//importing classes
import com.company.data.interfaces.PostgresDB;
import com.company.data.interfaces.IDB;
import com.company.repositorie.interfaces.IUserRepository;
import com.company.repositorie.interfaces.UserRepository;

public class Main {
    public static void main(String[] args) {
        //creating object of DB
        IDB db = new PostgresDB();
        //creating object of interface repository and assigning it repository class to use it
        IUserRepository repo = new UserRepository(db);
        //creating object of application
        MyApplication app = new MyApplication(repo);
        //starting it by its method
        app.start();
    }
}
