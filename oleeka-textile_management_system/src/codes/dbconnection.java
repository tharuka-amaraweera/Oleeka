/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package codes;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Kavi
 */
public class DBConnection {
    
    public static Connection connectDB()
    {
        Connection conn=null;
        
        
       try{
           Class.forName("com.mysql.jdbc.Driver");
           conn= (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/shop1","root","");
        }
        catch(Exception e){
            System.out.println(e);
        }
        
        return conn;
    
    }
    
}
