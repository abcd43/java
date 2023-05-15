/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package project;

import java.sql.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;


class Project extends JFrame implements ActionListener
{          
            JLabel l1,l2,l3,l4;
            JTextField t1,t2,t3,t4;
            JButton b1,b2,b3;
            String sql;
            JPanel p,p1;
            Connection con;
            PreparedStatement ps;

            JTable t;
            JScrollPane js;
            Statement stmt ;
            ResultSet rs ;
            ResultSetMetaData rsmd ;
            int columns;
            Vector columnNames = new Vector();
            Vector data = new Vector();

            Project()
            {

                        l1 = new JLabel("Enter Project ID :");
                        l2 = new JLabel("Enter Project name :");
                        l3 = new JLabel(" Enter Project Info :");      
                        l4 = new JLabel(" Enter Project Status :");
                        t1 = new JTextField(20);
                        t2 = new JTextField(20);
                        t3 = new JTextField(30);
                        t4 = new JTextField(30);
                        b1 = new JButton("Save");
                        b2 = new JButton("Display");
                        b3 = new JButton("Clear");

                        b1.addActionListener(this);
                        b2.addActionListener(this);
                        b3.addActionListener(this);

                        p=new JPanel();
                        p1=new JPanel();
                        p.add(l1);
                        p.add(t1);
                        p.add(l2);
                        p.add(t2);
                        p.add(l3);
                        p.add(t3);
                        p.add(l4);
                        p.add(t4);
                        p.add(b1);
                        p.add(b2);
                        p.add(b3);

                        add(p);
                        setLayout(new GridLayout(2,1));
                        setSize(600,800);
                        setVisible(true);
                        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            }
            public void actionPerformed(ActionEvent e)
            {
                        if((JButton)b1==e.getSource())
                        {
                                    int project_id = Integer.parseInt(t1.getText());
                                    String project_name = t2.getText();
                                    String project_desc = t3.getText();
                                    String project_status = t4.getText();
                                    System.out.println("Accept Values");
                                    try
                                    {
                                                Class.forName("org.postgresql.Driver");
                                                con=DriverManager.getConnection("jdbc:postgresql:typrashant","postgres","root");                                              
                                                sql = "insert into project values(?,?,?,?)";
                                                ps = con.prepareStatement(sql);
                                                ps.setInt(1,project_id);
                                                ps.setString(2, project_name);
                                                ps.setString(3,project_desc);
                                                ps.setString(4,project_status);
                                                
                                                System.out.println("values set");
                                                int n=ps.executeUpdate();
                                                if(n!=0)
                                                {
                                                            JOptionPane.showMessageDialog(null,"Record insered ...");                                  
                                                }
                                                else
                                                            JOptionPane.showMessageDialog(null,"Record NOT inserted ");
                                    }
                                    catch(Exception ex)
                                    {
                                                System.out.println(ex);          
                                                
                                    }
                        }
                        else if((JButton)b2==e.getSource())
                        {
                                    try
                                    {
                                                Class.forName("org.postgresql.Driver");
                                                con=DriverManager.getConnection("jdbc:postgresql:typrashant","postgres","root");    
                                                System.out.println("Connected");
                                                stmt=con.createStatement();
                                                rs = stmt.executeQuery("select * from project");
                                                rsmd = rs.getMetaData();
                                                columns = rsmd.getColumnCount();

                                                for(int i = 1; i <= columns; i++)
                                                {
                                                            columnNames.addElement(rsmd.getColumnName(i));
                                                }

                                                while(rs.next())
                                                {
                                                            Vector row = new Vector(columns);
                                                            for(int i = 1; i <= columns; i++)
                                                            {
                                                                        row.addElement(rs.getObject(i));
                                                            }
                                                            data.addElement(row);
                                                }
                                                t = new JTable(data, columnNames);
                                                js = new JScrollPane(t);

                                                p1.add(js);
                                                add(p1);

                                                setSize(600, 600);
                                                setVisible(true);
                                    }
                                    catch(Exception e1)
                                    {
                                                System.out.println(e1);
                                    }
                        }
                        else
                        {
                                    t1.setText(" ");
                                    t2.setText(" ");
                                    t3.setText(" ");
                                    t4.setText("");
                       }
            }

            public static void main(String a[])
            {
                        Project p = new Project();
            }
}
