package Week_5;

import java.util.Stack;

public class StackSizeSearchExample {
    public static void main(String[] args) {
        Stack<String> stackOfCards = new Stack<>();

        // Push items onto the stack
        stackOfCards.push("Jack");
        stackOfCards.push("Queen");
        stackOfCards.push("King");
        stackOfCards.push("Ace");

        // Print the stack
        System.out.println("Stack: " + stackOfCards);

        // Check if the stack is empty
        System.out.println("Is Stack empty? : " + stackOfCards.isEmpty());

        // Find the size of the stack
        System.out.println("Size of Stack: " + stackOfCards.size());

        // Search for an element
        // The search() method returns the 1-based position of the element from the top
        // of the stack
        // It returns -1 if the element was not found in the stack
        int position = stackOfCards.search("Queen");
        if (position != -1) {
            System.out.println("Found element \"Queen\" at position: " + position);
        } else {
            System.out.println("Element not found");
        }
    }
}
