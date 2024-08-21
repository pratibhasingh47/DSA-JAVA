package Week_4;

// Java program to implement a Singly Linked List
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

    // Method to insert at the front of the list
    public void insertFront(T data) {
        // Create a new node with given data
        Node newNode = new Node(data);
        newNode.next = head.next;
        // Make the new node as the first node
        head.next = newNode;
    }

    public void insertEnd(T data) {
        Node newNode = new Node(data);
        newNode.next = null;
        Node temp = this.head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    public void insertKey(T data, T key) {
        Node newNode = new Node(data);
        newNode.next = null;
        Node temp = this.head;
        boolean status = false;
        while (temp != null) {
            if (temp.data == key) {
                status = true;
                break;
            }
            temp = temp.next;
        }
        if (status) {
            newNode.next = temp.next;
            temp.next = newNode;
        }
    }

    public void printList() {
        Node currNode = this.head.next;
        System.out.print("LinkedList: ");
        // Traverse through the LinkedList
        while (currNode != null) {
            // Print the data at current node
            System.out.print(currNode.data + " ");
            // Go to next node
            currNode = currNode.next;
        }
        System.out.println();
    }

    public void merge(JLinkedList<T> l2) {
        Node l1Node = this.head;
        Node l2Node = l2.head.next; // Skip the dummy node in l2

        // Traverse to the end of this list
        while (l1Node.next != null) {
            l1Node = l1Node.next;
        }

        // Connect the end of this list to the start of l2
        l1Node.next = l2Node;
    }
    // Additional methods to be defined …
}
