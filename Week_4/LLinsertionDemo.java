package Week_4;

import java.util.LinkedList;
import java.util.Iterator;

public class LLinsertionDemo {
    public static void main(String[] args) {
        // Creating an empty linked list of class LinkedList
        LinkedList<String> ll = new LinkedList<String>();

        // Adding elements to the linked list using different add methods
        ll.add("Mumbai"); // Add an initial item
        ll.add("Chennai"); // Add another item
        ll.addLast("Kolkata"); // Add at the end
        ll.addFirst("Delhi"); // Add at the front
        ll.add(2, "Bangalore"); // Add at a specific location
        ll.add("Guwahati"); // Sequential add goes at the end
        ll.add("Hyderabad"); // Another sequential insertion

        // Printing the linked list using an iterator
        Iterator<String> itr = ll.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        // Alternatively, printing the entire linked list
        System.out.println("Linked list: " + ll);
    }
}
