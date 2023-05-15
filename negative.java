import java.util.LinkedList;
import java.util.Scanner;

public class negative
 {
    public static void main(String[] args) 
    {
        LinkedList<Integer> numbers = new LinkedList<>();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the numbers");
        int n = sc.nextInt();

        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            numbers.add(num);
        }

        System.out.println("Negative Integers:");
        for (int num : numbers)
        {
            if (num < 0) {
                System.out.println(num);
            }
        }
    }
}
