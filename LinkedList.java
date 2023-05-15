import java.util.*;

public class LinkedList {
    public static void main(String[] args)
     {
        // Create a LinkedList of String objects
        LinkedList<String> linkedList = new  LinkedList<String>();
        //LinkedList<String> linkedList = new LinkedList<>();

        // Add elements at the end of the list
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Orange");

        // Display the initial contents of the list
        System.out.println("Initial LinkedList: " + linkedList);

        // Delete the first element of the list
        linkedList.removeFirst();

        // Display the updated contents of the list
        System.out.println("LinkedList after removing first element: " + linkedList);

        // Display the contents of the list in reverse order
        System.out.println("LinkedList in reverse order:");
        for (int i = linkedList.size() - 1; i >= 0; i--)
         {
            System.out.println(linkedList.get(i));
        }
    }
}
