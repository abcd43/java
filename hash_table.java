//Assignment NO:1 Set A d
import java.io.*;
import java.util.*;
class hash_table
{
	public static void main (String args[]) throws Exception
	{
		Hashtable<String,Integer> ht = new Hashtable<String,Integer>();
		Scanner sc = new Scanner(System.in);		
		int mno;
		String name = null;
		System.out.println("\nEnter no of Students");
		int n = sc.nextInt();
		for(int i=0; i<n; i++)
		{
			System.out.println("Enter Student Name:");
			name = sc.next();
			System.out.println("Enter Student Mobile No:");
			mno = sc.nextInt();
			ht.put(name,mno);
		}
		System.out.println("Hash Table"+ht);
		Enumeration k = ht.keys();
		Enumeration v = ht.elements();
		System.out.println("Name\tMobile Numbers");
		while(k.hasMoreElements())
		{
			System.out.println(k.nextElement()+"\t"+k.nextElement());
		}	
	}
}
