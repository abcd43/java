//Assignment 2...Set A...b

import java.io.*;
class reverse_thread
{
 public static void main(String[] args)
 {
 Thread t=Thread.currentThread();
 System.out.println("Current Thread is: "+t);
 t.setName("My Thread");
 System.out.println("After changing the name thread is:" +t);
 try
 {
  for(int n=10; n>0;n--)
  {
    System.out.println(n);
    Thread.sleep(6000);
    }
  }
 catch(Exception e)
 {
  System.out.println(e);
  }
 }  
}
    
