package Week_4;

import java.util.LinkedList;

public class DeletionFromLL {
    public static void main(String[] args) {
        // Creating a linked list
        LinkedList<String> ll1 = new LinkedList<>();
        ll1.add("A");
        ll1.add("E");
        ll1.add("I");
        ll1.add("O");
        ll1.add("U");
        ll1.add("H");
        System.out.println("List of vowels: " + ll1);

        // Removing specific element from the linked list
        ll1.remove("H"); // Remove the vowel H
        System.out.println("After deletion of H: " + ll1);

        // Removing element on the basis of specific position
        ll1.remove(0); // This will remove A from the list
        System.out.println("After invoking remove(index) method: " + ll1);

        // Creating another list of semi-vowels
        LinkedList<String> ll2 = new LinkedList<>();
        ll2.add("M");
        ll2.add("N");

        // Adding new elements to the list of vowels
        ll1.addAll(ll2); // Append ll2 after ll1
        System.out.println("Updated list: " + ll1);

        // Removing first element from the list
        ll1.removeFirst();
        System.out.println("After invoking removeFirst() method: " + ll1);

        // Removing last element from the list
        ll1.removeLast();
        System.out.println("After invoking removeLast() method: " + ll1);

        // Removing all elements from ll2
        ll1.removeAll(ll2);
        System.out.println("After removing semi-vowels: " + ll1);

        // Adding new elements to the list
        ll1.add("A");
        ll1.add("B");
        ll1.add("A");

        // Removing first occurrence of element from the list
        ll1.removeFirstOccurrence("A");
        System.out.println("After removing first occurrence of A: " + ll1);

        // Removing last occurrence of element from the list
        ll1.removeLastOccurrence("B");
        System.out.println("After invoking removeLastOccurrence() method: " + ll1);

        // Removing all elements from the list
        ll1.clear();
        System.out.println("After invoking clear() method: " + ll1);
    }
}
