/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package codes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Dell
 */
public class database_connect {
    public static Connection getConnection() throws ClassNotFoundException, SQLException{
        Connection c = null;
        if(c==null){
                    Class.forName("com.mysql.jdbc.Driver");
                    c = DriverManager.getConnection("jdbc:mysql://localhost:3309/oleeka", "root", "123456");
           }
        return c;
        
    }
    
}
