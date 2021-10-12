package com.example.databaseserversidewd;

import java.sql.DriverManager;
import java.sql.Statement;

public enum UserDAO {

    instance;


    public void insert() {
        Class.forName("org.hsqldb.jdbcDriver");
        Connection c = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/oneDB", "sa", "");
        Statement s
    }
}
