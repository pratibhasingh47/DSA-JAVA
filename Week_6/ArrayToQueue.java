package Week_6;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class ArrayToQueue {
    public static void main(String[] args) {
        // Create an array of String objects
        String[] city = { "CCU", "DEL", "BLR", "MUM", "GAU" };

        // Declare a queue
        Queue<String> queue = new PriorityQueue<>();

        // Copying the array to the Queue
        Collections.addAll(queue, city);

        // Printing the array
        System.out.println("Array:");
        for (String c : city) {
            System.out.print(c + " ");
        }
        System.out.println();

        // Printing the queue
        System.out.println("Queue: " + queue);
    }
}
