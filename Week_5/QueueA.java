package Week_5;

public class QueueA<T> {
    private T[] data;
    private int front, rear, size, capacity;

    @SuppressWarnings("unchecked")
    public QueueA(int capacity) {
        this.capacity = capacity;
        this.data = (T[]) new Object[capacity];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
    }

    // Add an element to the rear of the queue
    public void enqueue(T item) {
        if (isFull()) {
            throw new IllegalStateException("Queue is full");
        }
        rear = (rear + 1) % capacity;
        data[rear] = item;
        size++;
    }

    // Remove and return the element from the front of the queue
    public T dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        T item = data[front];
        data[front] = null; // Clear the slot for garbage collection
        front = (front + 1) % capacity;
        size--;
        return item;
    }

    // Check if the queue is empty
    public boolean isEmpty() {
        return size == 0;
    }

    // Check if the queue is full
    public boolean isFull() {
        return size == capacity;
    }

    // Print the elements of the queue
    public void printQueue() {
        for (int i = 0; i < size; i++) {
            int index = (front + i) % capacity;
            System.out.print(data[index] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        QueueA<Integer> queue = new QueueA<>(5);

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
