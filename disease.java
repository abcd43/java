//Assignment 2...Set A...a

import java.util.*;
class Mythread extends Thread
{
String msg;
int n;
Mythread(String m,int a)
 {
  msg=m;
  n=a;
  }
  public void run()
   {
     for(int i=0; i<n; i++)
      System.out.println(msg+ " "+i);
     }
   }
public class disease
 {
   public static void main(String[] args)
   {
  Mythread m1=new Mythread("COVID19",10) ;    
  Mythread m2=new Mythread("LOCKDOWN2020",20) ;    
  Mythread m3=new Mythread("VACCINATED2021",30) ;    
   m1.start();
   m2.start();
   m3.start();
   }
 }  
