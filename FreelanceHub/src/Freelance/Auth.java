package Freelance;
import java.util.*;
import java.awt.*;
import java.awt.event.* ;
import java.sql.Connection;
import java.sql.SQLException;

import javax.swing.*;

import Freelance.DatabaseConnection;

public class Auth {
	
	
	void login()
	{
		String user_ID = JOptionPane.showInputDialog("Enter your USER ID:");
		String password = JOptionPane.showInputDialog("Enter Password");
Connection conn = DatabaseConnection.getConnection();
        
        if (conn != null) {
            try {
                
                conn.close();
                System.out.println("Connection closed.");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("Failed to make connection!");
        }
    }
	void register()
	{
		
	}

}
