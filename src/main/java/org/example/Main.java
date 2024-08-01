package org.example;

import java.sql.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws SQLException {

        IgniteDB igniteDB = new IgniteDB();
        igniteDB.connect();

        ArrayList<Subscriber> subscribers  = igniteDB.getAllCustomers();

        igniteDB.close();

        System.out.println("\n\n");
        subscribers.forEach(System.out::println);


    }
}