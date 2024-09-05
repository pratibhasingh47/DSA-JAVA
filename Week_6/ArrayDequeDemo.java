package Week_6;

import java.util.ArrayDeque;

public class ArrayDequeDemo {
    public static void main(String[] args) {
        // Create an ArrayDeque
        ArrayDeque<String> adq = new ArrayDeque<>();

        // Use ArrayDeque like a stack
        adq.push("A");
        adq.push("B");
        adq.push("D");
        adq.push("E");
        adq.push("F");

        System.out.print("Popping the stack: ");

        // Pop elements from the stack until it's empty
        while (adq.peek() != null) {
            System.out.print(adq.pop() + " ");
        }
        
        System.out.println();
    }
}
