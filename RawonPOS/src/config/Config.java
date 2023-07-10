package config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Config {
    private static Connection mysqlconfig;
    public static Connection configDB() throws SQLException{
    try {   
        String url="jdbc:mysql://localhost:3306/db_coolinarypos";
        String user = "root";
        String pass = ""; 
        DriverManager.registerDriver(new com.mysql.jdbc.Driver());
        mysqlconfig=DriverManager.getConnection(url,user,pass);
    }
    catch (SQLException e){
        System.err.println(e.getMessage());
    }
    return mysqlconfig;
    }
    
}
