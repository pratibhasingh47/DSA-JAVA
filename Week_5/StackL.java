package Week_5;

// Assuming JLinkedList is defined elsewhere in your project
// Replace 'JLinkedList' with your actual linked list implementation if necessary
class JLinkedList<T> {
    private Node<T> head;

    // Inner class for Node
    static class Node<T> {
        T data;
        Node<T> next;

        Node(T data) {
            this.data = data;
            this.next = null;
        }

        public String getData() {
            throw new UnsupportedOperationException("Unimplemented method 'getData'");
        }
    }

    // Constructor
    public JLinkedList() {
        head = null;
    }

    // Method to add element at the front
    public void addFirst(T element) {
        Node<T> newNode = new Node<>(element);
        newNode.next = head;
        head = newNode;
    }

    // Method to remove and return the first element
    public T removeFirst() {
        if (head == null)
            return null;
        T removedData = head.data;
        head = head.next;
        return removedData;
    }

    // Method to check if list is empty
    public boolean isEmpty() {
        return head == null;
    }

    // Method to peek the first element
    public T peek() {
        return head == null ? null : head.data;
    }

    // Method to print all elements
    public void printList() {
        Node<T> current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}

// StackL using JLinkedList
public class StackL<T> {
    private JLinkedList<T> top; // Header to the list
    private int t; // Length of the list

    public StackL() {
        top = new JLinkedList<>();
        t = 0;
    }

    // Method to add an element to the stack
    public void push(T element) {
        top.addFirst(element); // Add element at the start
        t++;
    }

    // Method to remove and return the top element from the stack
    public T pop() {
        if (isEmpty()) {
            System.out.println("Stack underflow! Cannot remove element.");
            return null;
        }
        t--;
        return top.removeFirst();
    }

    // Method to check if the stack is empty
    public boolean isEmpty() {
        return t == 0;
    }

    // Method to return the top element without removing it
    public T peek() {
        return top.peek();
    }

    // Method to print the current stack
    public void printStack() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
        } else {
            System.out.print("Stack elements: ");
            top.printList();
        }
    }
}
