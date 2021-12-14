package com.example.databaseserversidewd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public enum UserDAO {

    instance;

    public void insert(User u) throws SQLException {
        try {
            Class.forName("org.hsqldb.jdbcDriver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
//        User user = new User("name", "address");

        Connection con = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/oneDB", "sa", "");
        Statement stmt = con.createStatement();
        stmt.executeUpdate("INSERT INTO USER(name, address)" +
                "VALUES ('" + u.getName() + "','" + u.getAddress() + "')");

        stmt.close();
        con.close();
    }
}
