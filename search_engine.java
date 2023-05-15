//Assignment 2...Set B...b
import java.io.*;
import java.util.*;
public class search_engine extends Thread
{
  File f1;
  String fname ,line;
  static String str;
  LineNumberReader r=null;
  
  search_engine(String fname)
  {
   this.fname=fname;
   f1=new File(fname);
  }
  
public void run()
{
   try
     {
        FileReader fr=new FileReader(f1);
        r=new LineNumberReader(fr);
        while((line=r.readLine())!=null)
          { 
             if(line.indexOf(str)!=-1)
              {
                 System.out.println("String found in "+fname+ " at "+r.getLineNumber()+ " line");
                 stop();
                }
         }
   }
catch(Exception e)
 {
  System.out.println(e);
  }  
}
public static void main(String[] args)throws IOException
 {
   Thread t[]=new Thread[20];
   BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
   System.out.println("Enter String to be Search :");
   str=br.readLine();
   FilenameFilter f=new FilenameFilter()
   {
     public boolean accept(File file, String name)
      {
        if(name.endsWith(".txt"))
                  return true;
          else
                   return false;
           }
   };
  File dir1=new File("."); //current directory
  File[] files=dir1.listFiles(f);
  if(files.length==0)
        System.out.println("no files available with this extension ");
    else
      {
         for(int i=0; i<files.length; i++)
          {
            for(File af:files)
             {
               t[i]=new search_engine(af.getName());
               t[i].start();
              }
           }
       }
  }    
}                                           
