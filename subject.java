import java.util.LinkedList;
import java.util.Scanner;
import java.util.*;

public class subject
 {
    public static void main(String[] args) 
    {
        LinkedList<String> subjects = new LinkedList<String>();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the numbers of subjects");
        int n = sc.nextInt();

        System.out.println("Enter " + n + " subjects:");
        for (int i = 0; i < n; i++) {
            String sub = sc.next();
            subjects.add(sub);
        }

        Iterator itr = subjects.iterator();
		while(itr.hasNext())
		{
			System.out.println("Subjects Are : "+itr.next());		
		}
    }
}

