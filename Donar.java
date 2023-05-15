/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package donar;

/**
 *
 * @author hcl
 */
import java.sql.*;
public class Donar 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        try
        {
            Class.forName("org.postgresql.Driver");
            Connection con = DriverManager.getConnection("jdbc:postgresql:typrashant","postgres","root");     
            
            Statement stmt = null;
            stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("Select * From Donar");
            
            ResultSetMetaData rsmd = rs.getMetaData();
            System.out.println("----------------------------------------");
            
            int count = rsmd.getColumnCount();
            System.out.println("\tNo. of Cloumns"+rsmd.getColumnCount());
            System.out.println("----------------------------------------");
            
            for(int i =1; i < count; i++)
            {
               System.out.println("\t\tColumn No "+i);
               System.out.println("\t\tColumn Name "+rsmd.getColumnName(i));
               System.out.println("\t\tColumn Type "+rsmd.getColumnTypeName(i));
               System.out.println("\t\tColumn Display Size"+rsmd.getColumnDisplaySize(i));
               System.out.println();               
            }
            System.out.println("----------------------------------------");
            rs.close();
            con.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    
}
