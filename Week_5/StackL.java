package Week_5;

// Assuming JLinkedList is defined elsewhere in your project
import java.util.LinkedList; // Using Java's LinkedList for demonstration

public class StackL<T> {
    private LinkedList<T> top; // Header to the list
    private int t; // Length of the list

    public StackL() {
        top = new LinkedList<>();
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
        return top.removeFirst(); // Remove and return the top element
    }

    // Method to check if the stack is empty
    public boolean isEmpty() {
        return t == 0;
    }

    // Method to print the current stack
    public void printStack() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return;
        }
        System.out.println("Stack elements: " + top);
    }

    public static void main(String[] args) {
        StackL<Integer> stack = new StackL<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.printStack(); // Output: Stack elements: [30, 20, 10]
        stack.pop();
        stack.printStack(); // Output: Stack elements: [20, 10]
        System.out.println("Is stack empty? " + stack.isEmpty()); // Output: false
    }
}
