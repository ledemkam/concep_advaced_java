package org.lab;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnectivity {

    public  static  void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");

        String url = "jdbc:mysql://localhost:3308/testi";
        String user = "root";
        String password = "root";
        Connection connection = DriverManager.getConnection(url,user,password);

    }
}
