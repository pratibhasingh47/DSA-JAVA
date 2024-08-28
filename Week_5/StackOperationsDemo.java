package Week_5;

import java.util.Stack;

public class StackOperationsDemo {
    public static void main(String[] args) {
        // Creating a stack of integers
        Stack<Integer> stack = new Stack<>();

        System.out.println("Empty stack: " + stack);
        System.out.println("Is stack empty? " + stack.empty());

        /* Uncommenting the following line will throw an exception 
           if you try to pop an item from an empty stack. */
        // System.out.println("Empty stack: Pop Operation: " + stack.pop());

        // Inserting some data into the stack
        stack.push(1);
        stack.push(22);
        stack.push(333);
        stack.push(4444);

        // Print the entire stack now
        System.out.println("Data in the stack: " + stack);

        // Perform a pop operation
        System.out.println("Pop operation: " + stack.pop());
        System.out.println("After pop operation: " + stack);

        // Perform a peek operation
        System.out.println("The element at the top: " + stack.peek());
        System.out.println("After peek operation: " + stack);

        // Perform a search operation
        System.out.println("Search operation (element 22): " + stack.search(22));

        // Check if the stack is empty
        System.out.println("Is stack empty? " + stack.empty());
    }
}
