package Week_6;

import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;

public class QueueRemoveOperation {
    public static void main(String[] args) {
        // Declaration of a queue using LinkedList class
        Queue<String> queue = new LinkedList<>();

        // Adding elements to the queue
        queue.offer("One");
        queue.offer("Two");

        // Display the contents of the queue
        System.out.println("Queue contents: " + queue);

        // Removing elements from the queue
        System.out.println("Removed: " + queue.remove());
        System.out.println("Removed: " + queue.remove());

        // Attempting to remove an element from an empty queue
        // This will throw a NoSuchElementException
        try {
            System.out.println("Removed: " + queue.remove());
        } catch (NoSuchElementException e) {
            System.out.println("Exception caught: Cannot remove from an empty queue");
        }
    }
}
