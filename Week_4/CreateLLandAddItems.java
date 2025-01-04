package Week_4;

import java.util.*;

public class CreateLLandAddItems {
    public static void main(String args[]) {
        // Creating an empty linked list of class LinkedList
        LinkedList<String> ll = new LinkedList<String>();

        // Adding elements to the linked list using a number of add methods
        ll.add("Mumbai");
        ll.add("Chennai");
        ll.add("Kolkata");
        ll.add("Delhi");
        ll.add("Bangalore");
        ll.add("Guwahati");
        ll.add("Hyderabad");

        // Printing the list using an iterator
        Iterator<String> itr = ll.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
