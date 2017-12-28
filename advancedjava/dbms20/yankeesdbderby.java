package dbms20;

import java.sql.*; 
import javax.swing.*;
import java.io.*; 

public class yankeesdbderby
{
  public static void main(String args[])
  {
    Connection con;  
    String createstring; 
    createstring = "create table yankees1 " +
      "(Name varchar(30), " +
      "POS varchar(2), " +
      "Number int)";    
    Statement stmt; 
    
    try
    {
      SimpleDataSource.init("databaseyankees.properties"); 
      con = SimpleDataSource.getConnection(); 
      stmt = con.createStatement();
      stmt.executeUpdate(createstring);
      
      JOptionPane.showMessageDialog(null,
                                    "Yankees table created",
                                    "SQL Statement Confirmation",
                                    JOptionPane.INFORMATION_MESSAGE );
      
      stmt.close();
      con.close();
      System.exit(0);
    }
    catch(ClassNotFoundException cnf)  
    {
      cnf.printStackTrace();
    }    
    catch(SQLException ex)
    {
      System.out.println("SQLException");
      System.out.println(ex.getMessage());
      ex.printStackTrace();
    }
    catch(IOException ioe) 
    {
      ioe.printStackTrace();
    }
    
    
  }
}

