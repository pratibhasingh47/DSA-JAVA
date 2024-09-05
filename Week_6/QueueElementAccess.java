package Week_6;

import java.util.*;

public class QueueElementAccess {
    public static void main(String[] args) {
        // Creating a queue
        Queue<String> queue = new LinkedList<>();

        // Adding an element to the queue
        queue.add("One");

        // Accessing the head element without removing it
        System.out.println("Head of the queue: " + queue.element());
        
        // Printing the queue
        System.out.println("Queue: " + queue);

        // Clearing the queue
        queue.clear();

        // Attempting to access the head of the queue after clearing
        try {
            System.out.println(queue.element()); // This will throw a NoSuchElementException
        } catch (NoSuchElementException e) {
            System.out.println("Queue is empty, no elements to access.");
        }
    }
}
