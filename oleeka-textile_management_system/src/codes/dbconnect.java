/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package codes;

import java.sql.Connection;
import java.sql.DriverManager;


public class dbconnect {
    public static Connection connect()
    {
        Connection conn=null;
        
        
        try {
            
            Class.forName("com.mysql.jdbc.Driver");
            conn= (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3309/oleeka","root","123456");
            
        } 
        catch (Exception e) {
            System.out.println(e );
        }
        
        return conn;
    }
}
