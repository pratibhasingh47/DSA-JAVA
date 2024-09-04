package Week_6;

import java.util.LinkedList;
import java.util.Queue;

public class QueueCreateLinkedList {
    public static void main(String[] args) {
        // Declaration of a queue using LinkedList class
        Queue<Integer> q = new LinkedList<>();

        // Adds elements {0, 1, 2, 3, 4} to the queue
        for (int i = 0; i < 5; i++) {
            q.add(i);
        }

        // Display contents of the queue
        System.out.println("The queue contains: " + q);

        // Removing the head element from the queue
        int x = q.remove();
        System.out.println("The element removed: " + x);
        System.out.println("Queue after removal: " + q);

        // Viewing the head of the queue
        int head = q.peek();
        System.out.println("Head of the queue: " + head);

        // Getting the size of the queue
        int size = q.size();
        System.out.println("Size of the queue: " + size);
    }
}
