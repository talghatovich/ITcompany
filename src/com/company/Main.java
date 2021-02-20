package com.company;

import com.company.data.interfaces.PostgresDB;
import com.company.data.interfaces.IDB;
import com.company.repositorie.interfaces.IUserRepository;
import com.company.repositorie.interfaces.UserRepository;

public class Main {

    public static void main(String[] args) {
        IDB db = new PostgresDB();
        IUserRepository repo = new UserRepository(db);
        MyApplication app = new MyApplication(repo);
        app.start();
    }
}
