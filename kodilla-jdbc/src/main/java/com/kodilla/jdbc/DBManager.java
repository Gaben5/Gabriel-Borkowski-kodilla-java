package com.kodilla.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public enum DBManager {
    INSTANCE;
    private Connection conn;
    DBManager(){
        Properties connectionProps = new Properties();
        connectionProps.put("user","videoo");
        connectionProps.put("password","kodilla");
        try {
            conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/task_crud" +
                            "?serverTimezone=Europe/Warsaw" +
                            "&useSSL=False",                                  // [10]
                    connectionProps);
        }catch (SQLException e){
            throw new ExceptionInInitializerError(e);
        }
    }
    public static DBManager getInstance(){
        return INSTANCE;
    }
    public Connection getConnection(){
        return conn;
    }
}
