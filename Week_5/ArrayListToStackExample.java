package Week_5;

import java.util.ArrayList;
import java.util.Stack;

public class ArrayListToStackExample {
    public static void main(String[] args) {
        // Create a collection object of type ArrayList
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        // Declare a Stack object
        Stack<Integer> stack = new Stack<>();

        // Loading the stack with the collection items
        stack.addAll(list);

        // Printing the top item in the stack
        System.out.println("Top item in the stack : " + stack.peek());
    }
}
