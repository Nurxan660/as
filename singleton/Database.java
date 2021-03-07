package com.Singleton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Database {

    private static Database instance;

    private Connection connection;
    private String connectionUrl = "jdbc:postgresql://localhost:5432/postgres";



    private Database() {
        try {

            Class.forName("org.postgresql.Driver");


            connection = DriverManager.getConnection(connectionUrl, "postgres", "aidalox2011");





        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static Database getInstance() {
        if(instance == null) instance = new Database();
        return instance;
    }

    public void query(String sql) {
        try(Statement statement = connection.createStatement()) {
            statement.execute(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
