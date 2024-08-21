package Week_4;

public class JLinkedList<T> {
    private Node head; // Head of the list

    // Inner class Node
    private class Node {
        T data;
        Node next;

        // Default constructor
        Node() {
            data = null;
            next = null;
        }

        // Constructor with data
        Node(T d) {
            data = d;
            next = null;
        }
    }

    // Constructor for JLinkedList
    public JLinkedList() {
        // Initialize head with a dummy node
        head = new Node();
    }

    // Method to maintain the collection to be defined …
}
