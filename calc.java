//Assignment 2...Set B...a

import java.util.*;
class thread implements Runnable
 {
   Thread t;
   int i,no,sum;
   int a[]=new int[1000];
   thread(String s,int n)
   {
     Random rs=new Random();
     t=new Thread(this,s);
     n=no;
     int j=0;
     for(i=0; i<1000; i++)
      {
         a[j]=rs.nextInt()%100;
         j++;
       }
     t.start();
    }
public void run()
{
 for(i=0; i<1000; i++)
  {
     sum=sum+a[no];
     no++;
    }
 System.out.println("Sum =" +sum);
 System.out.println("Avg =" +sum/100);
  }
 }    
public class calc
{
  public static void main(String[] args)throws Exception
  {
 thread t1=new thread("a",0);
   t1.t.join();
  thread t2=new thread("b",100);
   t2.t.join();
  thread t3=new thread("c",200);
   t3.t.join();
  thread t4=new thread("d",300);
   t4.t.join();
  thread t5=new thread("e",400);
   t5.t.join();
  thread t6=new thread("f",500);
   t6.t.join();
  thread t7=new thread("g",600);
   t7.t.join();
  thread t8=new thread("i",700);
   t8.t.join();
  thread t9=new thread("j",800);
   t9.t.join();
  thread t10=new thread("k",900);
    t10.t.join();        
   }
}          
