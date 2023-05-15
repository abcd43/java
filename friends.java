import java.util.*;
public class friends
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		//LinkedList<String> ll = new  LinkedList<String>();
		Set<String> s = new HashSet<>();
		String f;
		System.out.println("How Many Friends.?");
		int n = sc.nextInt();
		for(int i=0; i<n; i++)
		{
			System.out.println("Enter Friends Name");
			f = sc.next();
			s.add(f);
		}
		List<String> fl = new ArrayList<>(s);
        Collections.sort(fl);
        System.out.println("\nascending order");
        for(String friend: fl)
        {
        	System.out.println(friend);
        }	
		//System.out.println("Friends are"+s);
	}
}

