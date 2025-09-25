package Freelance;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

    private static final String DB_URL = "jdbc:mysql://localhost:3306/test";
    private static final String USER = "root";
    private static final String PASS = "************"; 

    
    public static Connection getConnection() {
        
        Connection connection = null;
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            System.out.println("Connecting to the database...");
            connection = DriverManager.getConnection(DB_URL, USER, PASS);
            System.out.println("Connection established successfully!");

        } catch (ClassNotFoundException e) {
            System.err.println("JDBC Driver not found!");
            e.printStackTrace();
        } catch (SQLException e) {
            System.err.println("Connection failed! Check your URL, username, and password.");
            e.printStackTrace();
        }

        return connection;
        
    } 
}