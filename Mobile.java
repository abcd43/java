
package mobile;

import java.sql.*;
import java.util.*;

public class Mobile
{
    public static void main(String[] args) {
        {
          Connection con;
            con = null;
          PreparedStatement pstmt ;
          pstmt = null ;
          Statement stmt ;
                  stmt = null;
          ResultSet rs = null;
          
          try 
          {
              Class.forName("org.postgresql.Driver");
              con = DriverManager.getConnection("jdbc:postgresql:ty_nisha","postgres","REDHAT");
              Scanner sc = new Scanner(System.in);
              System.out.println("\n Mobile Information ");
               do {
                 System.out.println("\n \t 1.Insert \n \t 2. Modify \n\t 3.delete \n\t 4.search \n\t 5.view all 6.Exit \n");
                 System.out.println("\n Enter Your Choice");
                 int ch = sc.nextInt();
                 switch(ch) 
                 {
                     case 1 : 
                         pstmt = con.prepareStatement("insert into Mobile values (?,?,?,?,?,?,?,?)");
                         System.out.println("\n Enter Model Number ");
                         int mno = sc.nextInt();
                         pstmt.setInt(1,mno);
                         
                         sc.nextLine();
                         System.out.println("\n Enter Model Name ");
                         String name = sc.next();
                         sc.nextLine();
                         pstmt.setString(2,name);
                         System.out.println("\n Enter Model_color ");
                         String color = sc.next();
                         sc.nextLine();
                         pstmt.setString(3, color);
                         System.out.println("\n Enter sim type ");
                         String type = sc.next();
                         sc.nextLine();
                         pstmt.setString(4, type);
                         System.out.println("\n Enter Battery Capacity");
                         int battery = sc.nextInt();
                         pstmt.setInt(5, battery);
                         System.out.println("\n Enter Internal Storage in GB:");
                         int internal = sc.nextInt();
                         pstmt.setInt(6, internal);
                         System.out.println("\n Enter RAM in GB ");
                         int ram = sc.nextInt();
                         pstmt.setInt(7, ram);
                         sc.nextLine();
                         System.out.println("\n Enter Procsser Type ");
                         String pr = sc.next();
                         sc.nextLine();
                         pstmt.setString(8, pr);
                         
                         int result = pstmt.executeUpdate();
                         System.out.println(result+" Recort Inserted \n ");
                         break;
                         
                     case 2 : 
                         String SQL = "update mobile set name=? where mno=?";
                         pstmt = con.prepareStatement(SQL);
                         
                         System.out.println("\n Enter Model No for Update Record ");
                         int no = sc.nextInt();
                         pstmt.setInt(2, no);
                         
                         sc.nextLine();
                         System.out.println("\n Enter Upadated Model Name ");
                         String mname = sc.next();
                         sc.nextLine();
                         pstmt.setString(1, mname);
                         
                         int result2 = pstmt.executeUpdate();
                         System.out.println(result2+"\n Record updated");
                         break;
                         
                     case 3 :
                         pstmt = con.prepareStatement("delete from Mobile where mno=?");
                         System.out.println("\n Enter Model no for delete the record");
                         int model = sc.nextInt();
                         pstmt.setInt(1, model);
                         int result3 = pstmt.executeUpdate();
                         System.out.println(result3+"\n Record deleted");
                         break;
                         
                     case 4 :
                         pstmt = con.prepareStatement("select * from Mobile where mno=?");
                         System.out.println("\n Enter Model No for search record ");
                         int m = sc.nextInt();
                         pstmt.setInt(1, m);
                         
                         rs = pstmt.executeQuery();
                         System.out.println("\n ---------------- ");
                      while(rs.next())
                      {
                       System.out.println("\n" +rs.getInt(1) + "\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getString(4)+"\t"+rs.getInt(5)+"\t"+rs.getInt(6)+"\t"+rs.getInt(7)+"\t"+rs.getString(8));
                      }
                      System.out.println("\n ---------------- ");
                      break;
                      
                     case 5:
                         pstmt = con.prepareStatement("select * from Mobile");
                         System.out.println("\n ---------------- ");
                      while(rs.next())
                      {
                       System.out.println("\n" +rs.getInt(1) + "\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getString(4)+"\t"+rs.getInt(5)+"\t"+rs.getInt(6)+"\t"+rs.getInt(7)+"\t"+rs.getString(8));
                      }
                      System.out.println("\n ---------------- ");
                      break;
                      
                     case 6:
                         System.exit(1);
                         rs.close();
                         stmt.close();
                         pstmt.close();
                         con.close();
                         sc.close();
                 }
               } while(true);
          }
           catch(ClassNotFoundException | SQLException e)
           {
            System.out.println(e);
           }
          }
        }
        
    }
    
