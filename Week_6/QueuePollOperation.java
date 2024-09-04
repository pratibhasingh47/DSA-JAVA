package Week_6;

import java.util.LinkedList;
import java.util.Queue;

public class QueuePollOperation {
    public static void main(String[] args) {
        // Declaration of a queue using LinkedList class
        Queue<String> queue = new LinkedList<>();

        // Adding elements to the queue
        queue.offer("One");
        queue.offer("Two");

        // Display the contents of the queue
        System.out.println("Queue contents: " + queue);

        // Polling elements from the queue
        System.out.println("Polled: " + queue.poll());
        System.out.println("Polled: " + queue.poll());

        // Attempting to poll from an empty queue
        // This will return null
        System.out.println("Polled: " + queue.poll());
    }
}
