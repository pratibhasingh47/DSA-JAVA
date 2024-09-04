package Week_6;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueCreateExample1 {
    public static void main(String[] args) {
        Queue<String> queue = new PriorityQueue<>();

        // Adding elements into the queue
        queue.add("one");
        queue.add("two");
        queue.add("three");
        queue.add("four");

        // Displaying the contents of the queue
        System.out.println("Queue contents: " + queue);

        // Removing an element from the queue
        queue.remove("three");
        System.out.println("Queue after removing 'three': " + queue);

        // Checking the size of the queue
        System.out.println("Queue Size: " + queue.size());

        // Checking if the queue contains a specific element
        System.out.println("Queue Contains element 'two' or not? : " + queue.contains("two"));

        // Emptying the queue
        queue.clear();
        System.out.println("Queue after clearing: " + queue);
    }
}
