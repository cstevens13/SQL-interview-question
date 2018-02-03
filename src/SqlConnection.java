/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ceasarstevens
 */


import java.sql.*;
import javax.swing.*; 

public class SqlConnection {
    Connection conn=null; ///empty conection 
    public static Connection dbConnector()
    {
        try{
            Class.forName("org.sqlite.JDBC"); // sqlite connector 
            Connection conn=DriverManager.getConnection("jdbc:sqlite:\\Applications\\C\\Weststat interview stuff");
            JOptionPane.showMessageDialog(null, "Connection Successful");
            // /Users/ceasarstevens/Desktop/School folder/Job stuff/WESTAT INTERVIEW FOLDER
            return conn; 
        }
        catch (Exception e )
        {
            JOptionPane.showMessageDialog(null,e );
            return null; 
        }
    
    }
    
}
