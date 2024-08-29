package Week_5;

import java.util.Stack;

public class ArrayToStackExample2 {
    public static void main(String[] args) {
        // Array of integers to be converted into a stack
        Integer[] intArr = { 1001, 1002, 1003, 1004 };
        Stack<Integer> stack = new Stack<>();

        // Pushing array elements onto the stack
        for (Integer i : intArr) {
            stack.push(i);
        }

        // Printing the stack after adding array elements
        System.out.println("The stack: " + stack);

        // Pushing an additional element onto the stack
        stack.push(1001);

        // Performing a search operation
        int position = stack.search(1001);
        System.out.println("Position of element '1001' from the top: " + position);

        // Printing the final state of the stack
        System.out.println("Verify the result: " + stack);
    }
}
