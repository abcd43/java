//Assignment 2...Set A...c

import java.io.*;
import java.lang.*;
class Shared
{
 int a;
 boolean valueChanged=false;
 synchronized int get_data()
 {
   if(!valueChanged)
   try
    {
     wait();
     }
  catch(InterruptedException e)
   {
    System.out.println("Interrupted");
   }
       System.out.println("Read:" +a);
       valueChanged=false;
       notify();
       return a;
   }
 synchronized void put_data(int n)
 {
   if(valueChanged)
 try
	   {
		wait();
	   }
catch(InterruptedException e)
	 {
	   System.out.println("Interrupted");
	  }
 this.a=n;
 valueChanged=true;
    System.out.println("Written: "+a);
    notify();
  }
}//Shared End

class Producer implements Runnable
{
 Shared ob;
 Producer(Shared ob)  
 {
   this.ob=ob;
   new Thread(this,"Producer").start();
   }
public void run()
{
 int j=0;
  while(true)
   {
    ob.put_data(j++);
   }
 }
}//Producer End

class Consumer implements Runnable
{
 Shared ob;
 Consumer(Shared ob)
 {
  this.ob=ob;
  new Thread(this,"Consumer").start();
   }
public void run()
{
  while(true)
   {
    ob.get_data();
   }
 }
}//Consumer End       
    
class  sync
{
 public static void main(String args[])throws IOException 
 {
   Shared ob=new Shared();
   new Producer(ob);
   new Consumer(ob);
   System.out.println("Press Ctrl+c to stop");
   }
}
  
          
