//Assignment 1 Set B 1
import java.util.*;
public class treeset
{
	public static void main(String args [])
	{
		Scanner sc = new Scanner(System.in);
		TreeSet<Integer> ts = new TreeSet<Integer>();
		System.out.println("How many Numbers");
		int n = sc.nextInt();
		for(int i=1; i <=n; i++)
		{
			System.out.println("Enter Number "+i);
			int num = sc.nextInt();
			ts.add(num);
		}
		System.out.println("The Sorted Numbers are"+ts);
	}
}
