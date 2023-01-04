package se.project.elmira.Electricity;

import java.sql.*;

public class Connect {
    Connection connection;
    Statement statement;
    public Connect(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql:///ebs","root", "8376");
            statement = connection.createStatement();
        }catch (Exception e){
            System.out.println(e);
        }
    }
}

