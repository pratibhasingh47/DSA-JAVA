package Week_5;

import java.util.LinkedList;
import java.util.NoSuchElementException;

public class QueueL<T> {
    private LinkedList<T> list;
    
    public QueueL() {
        list = new LinkedList<>();
    }

    // Add an element to the rear of the queue
    public void enqueue(T item) {
        list.addLast(item);
    }

    // Remove and return the element from the front of the queue
    public T dequeue() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }
        return list.removeFirst();
    }

    // Check if the queue is empty
    public boolean isEmpty() {
        return list.isEmpty();
    }

    // Print the elements of the queue
    public void printQueue() {
        for (T item : list) {
            System.out.print(item + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        QueueL<Integer> queue = new QueueL<>();

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);

        System.out.println("Queue contents:");
        queue.printQueue();

        System.out.println("Dequeue operation: " + queue.dequeue());

        System.out.println("Queue contents after dequeue:");
        queue.printQueue();

        queue.enqueue(6);
        System.out.println("Queue contents after enqueue:");
        queue.printQueue();
    }
}
