import java.util.*;
public class city
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		 ArrayList<String> al = new  ArrayList<String>();
		String c;
		System.out.println("How Many City..?");
		int n = sc.nextInt();
		for(int i=0; i<n; i++)
		{
			System.out.println("Enter City Name");
			c = sc.next();
			al.add(c);
		}		
		System.out.println("Citys are"+al);
		al.clear();
		if(al.isEmpty() == true)
			System.out.println("Arraylist is empty");
		else
			System.out.println("Arraylist is not empty");
	}
}

