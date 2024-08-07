/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jdbc;

import java.sql.*;
import javax.xml.datatype.DatatypeConfigurationException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

/**
 *
 * @author david
 */
public class JDBC{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException{
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost:1433;databaseName=Library";
            String user = "sa";
            String pass = "123456";
            
            Connection con = DriverManager.getConnection(url, user, pass);
            System.out.println("Connection Succeeded!");
            
            Scanner sc = new Scanner(System.in);
            System.out.println("Input number: ");
            int id = sc.nextInt();
            
            String query5 = "Select * from Customer where CID = ?";
            
            Statement stmt = con.createStatement();
            PreparedStatement ps = con.prepareStatement(query5);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            String query4 = "Use Library;"
                    + "Create table publishers"
                    + "(pubId varchar(30),"
                    + "pubName varchar(50),"
                    + "phone integer,)";
            
            String query3 = "delete from customer where Lastname = 'Ajanlekoko'";
            String query2 = "Select * from customer";
            String query = "insert into customer values (3, 'Sharon', 'Ijasan', '07011122419', 'Sharon@gmail.com')";
//            int rs = stmt.executeUpdate(query4);
//            ResultSet rs = stmt.executeQuery(query2);
            while(rs.next()){
                System.out.println("CID:" + rs.getInt(1));
            }
                    } catch (ClassNotFoundException ex) {
            Logger.getLogger(JDBC.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
