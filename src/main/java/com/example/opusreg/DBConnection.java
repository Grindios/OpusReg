package com.example.opusreg;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    private static final String protocol = "jdbc";
    private static final String vendorName = ":mysql:";
    private static final String ipAddress = "//localhost:3306/";
    private static final String dbName = "opus_registrant";


    private static final String jdbcURL = protocol + vendorName + ipAddress + dbName;
    private static final String MYSQLJBCDriver = "com.mysql.cj.jdbc.Driver";
    //com.mysql.jdbc.Driver
    private static final String password = "password";
    private static final String username = "root";
    private static Connection conn = null;

    public static Connection startConnection() {
        try {
            Class.forName(MYSQLJBCDriver);
            conn = DriverManager.getConnection(jdbcURL, username, password);

            System.out.println("Connection successful");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            System.out.println("1 not successful");
        } catch (ClassNotFoundException e) {
            System.out.println(e);
            System.out.println(e.getMessage());
        }
        return conn;
    }

    public static Connection getConnection() {

        return conn;
    }

    public static void closeConnection() {
        try {
            conn.close();
        }
        catch (Exception e) {

        }
    }
}
