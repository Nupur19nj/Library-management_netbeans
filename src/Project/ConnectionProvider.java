/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Project;
import java.sql.*;
/**
 *
 * @author Sanjeevani Lakade
 */
public class ConnectionProvider {
    public static Connection getCon(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/lms";
            String username = "root";
            String password = "sanjeezsql25@";
            Connection con = DriverManager.getConnection(url, username, password);
            return con;
        }
        catch(ClassNotFoundException | SQLException e){
            System.out.println(e);
        return null;
        }
    }
}
