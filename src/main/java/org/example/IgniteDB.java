package org.example;

import java.sql.*;
import java.util.ArrayList;

public class IgniteDB {

    private final String jdbcUrl = "jdbc:ignite:thin://127.0.0.1:10800";
    private Statement stmt;
    private Connection conn;

    public void connect() {

        try {
            //create connection
            conn = DriverManager.getConnection(jdbcUrl);
            System.out.println("Connected to Apache Ignite!");

            stmt = conn.createStatement();



        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    public void close() throws SQLException {

        stmt.close();
        conn.close();
    }

    public ArrayList<Subscriber> getAllCustomers() {

        // Execute a query
        String sql = "SELECT * FROM SUBSCRIBER";
        ArrayList<Subscriber> subscribers = new ArrayList<Subscriber>();

        try {
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next()) {
                subscribers.add(new Subscriber(
                        rs.getInt("SUBSC_ID"),
                        rs.getString("SUBSC_NAME"),
                        rs.getString("SUBSC_SURNAME"),
                        rs.getString("MSISDN"),
                        rs.getInt("TARIFF_ID"),
                        rs.getTimestamp("START_DATE").getTime()
                ));
            }

            return subscribers;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
