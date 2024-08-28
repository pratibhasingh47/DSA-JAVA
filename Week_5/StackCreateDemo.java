package Week_5;

import java.util.Stack;

public class StackCreateDemo {
    public static void main(String[] args) {
        // Creating a stack of integers
        Stack<Integer> stack = new Stack<Integer>();

        // Printing the stack
        System.out.println("Stack contains: " + stack);

        // Checking if the stack is empty
        System.out.println("Is stack empty? : " + stack.empty());
    }
}
