package cl.duoc.interfazgrafica.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConexionDB {
    
    Connection connection;
    
    public ConexionDB(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            
            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/test",
                    "root",
                    ""
            );
            
            System.out.println("All good, connected right!!");
        } catch (Exception ex) {
            System.out.println("error en DB " + ex.getMessage());
        }
    }
    
    
    public ResultSet EjecutarQuery(String sql) throws SQLException {
        Statement statement = connection.createStatement();
        return statement.executeQuery(sql);
    }
}