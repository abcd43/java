//Assignment 1 Set B 2
import  java.util.*;
public class SortHashMap
{
	public static void man(String args[])
	{
		Scanner sc = new Scanner(System.in);		
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		System.out.println("How many Numbers");
		int n = sc.nextInt();
		for(int i=1; i <=n; i++)
		{
			System.out.println("Enter Roll No"+i+"Student");
			int num = sc.nextInt();
			System.out.println("Enter Name "+i+" Stdudent");
			String name = sc.next();
			hm.put(num,name);
		}
		Iterator <Integer> it = hm.keySet().iterator();
		System.out.println("Before Sorting");
		while(it.hasNext())
		{				
			int key = (int)it.next();
			System.out.println("Rol No:"+key+"Name"+hm.get(key));		
		}
		System.out.println("\nAfter Sorting");
		TreeMap <Integer,String> tm = new TreeMap <Integer,String> (hm);	
		Iterator <Integer> itr = tm.keySet().iterator();		
		while(it.hasNext())
		{				
			int key = (int)itr.next();
			System.out.println("Rol No:"+key+"Name"+hm.get(key));		
		}
	}
}
