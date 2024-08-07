/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbc;

import java.sql.*;

/**
 *
 * @author david
 */
public class metaData {
    public static void main(String[] args) {
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost:1433;databaseName=AccountDetails";
            String user = "sa";
            String pass = "123456";
            
            Connection con = DriverManager.getConnection(url, user, pass);
            System.out.println("Connection Succeeded!");
            
            String query = "Select * from userInfo";
            Statement st = con.createStatement();
            
            ResultSet rs = st.executeQuery(query);
            
            ResultSetMetaData rsm = rs.getMetaData();
            
            int count = rsm.getColumnCount();
            for(int i = 1; i <= count; i++){
//                System.out.println("CN: " + rsm.getColumnName(i) + "CT: " + rsm.getColumnTypeName(i));
            }
            while(rs.next()){
//                for(int i = 1; i <= count; i++){
//                    
//                }
                String user1 = rs.getString(rsm.getColumnName(2));
                String pass1 = rs.getString(rsm.getColumnName(5));
                    
                System.out.println("Username: " + user1 +" Password: " + pass1);
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
