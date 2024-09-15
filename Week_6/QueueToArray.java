package Week_6;

import java.util.*;

public class QueueToArray {
    public static void main(String[] args) {
        // Creating a queue
        Queue<String> queue = new LinkedList<>();

        // Adding elements to the queue
        queue.add("Jio");
        queue.add("123");
        queue.add("John");
        queue.add("Jaya");
        queue.add("Jim");
        queue.add("!@#$%");

        // Copying the queue to an array of String objects
        String[] friends = queue.toArray(String[]::new);

        // Printing the array
        System.out.println("Array: " + Arrays.toString(friends));

        // Printing the queue
        System.out.println("Queue: " + queue);
    }
}
