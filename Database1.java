/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package database1;

/**
 *
 * @author Prashant
 */
import java.sql.*;
public class Database1 
{
    public static void main(String[] args) 
    {
        try
        {
            Class.forName("org.postgresql.Driver");
            //Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost/postgres","postgres","root");
            Connection conn=DriverManager.getConnection("jdbc:postgresql:typrashant","postgres","root");
            DatabaseMetaData dbmd = conn.getMetaData();
            System.out.println("\t-----------------------------------------------------");
            System.out.println("\t\tDriver Name"+dbmd.getDriverName());
            System.out.println("\t\tDriver Version"+dbmd.getDriverVersion());
            System.out.println("\t\tUser Name"+dbmd.getUserName());
            System.out.println("\t\tDatabase Product Name"+dbmd.getDatabaseProductName());
            System.out.println("\t\tDatabase Product Version"+dbmd.getDatabaseProductVersion());
            System.out.println("\t-------------------------------------------------------");
            
            String table[] = {"TABLE"};
            ResultSet rs = dbmd.getTables(null, null, null, table);
            System.out.println("\t\tTables Names:");
            while(rs.next())
            {
                System.out.println(rs.getString("TABLE_NAME"));
            } 
            rs.close();
            conn.close();
         }
         catch(Exception e)
         {
             System.out.println(e);
         }     
    }
    
}
