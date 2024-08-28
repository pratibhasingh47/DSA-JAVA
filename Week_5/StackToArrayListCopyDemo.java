package Week_5;

import java.util.ArrayList;
import java.util.Stack;

public class StackToArrayListCopyDemo {
    public static void main(String[] args) {
        // The Input stack
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        // Create a collection object of type ArrayList
        ArrayList<Integer> list = new ArrayList<>();
        
        // Copy the elements in stack to the collection
        list.addAll(stack);

        // Printing the Stack
        System.out.println("Non-Empty Stack: " + stack);

        // Printing the ArrayList
        System.out.println("Non-Empty List: " + list);
    }
}
