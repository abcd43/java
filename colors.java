import java.util.*;
public class colors
{
	public static void main(String args [])
	{
		Scanner sc = new Scanner(System.in);
		TreeSet<String> ts = new TreeSet<String>();
		System.out.println("How many Colors..?");
		int n = sc.nextInt();
		for(int i=1; i <=n; i++)
		{
			System.out.println("Enter Color "+i);
			String c = sc.next();
			ts.add(c);
		}
		//System.out.println("Colors are"+ts);
		Iterator itr = ts.iterator();
		while(itr.hasNext())
		{
			System.out.println("Colors Are : "+itr.next());		
		}
	}
}
