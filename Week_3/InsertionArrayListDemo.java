package Week_3;

import java.util.ArrayList;

public class InsertionArrayListDemo {
    public static void main(String[] args) {
        // Creating a collection first. Let it be with the simple method
        ArrayList<Integer> odd = new ArrayList<>(); // Declaring odd as a collection
        // Adding elements into the odd collection
        odd.add(1);
        odd.add(3);
        odd.add(5);
        odd.add(7);
        odd.add(9);
        System.out.println(odd);

        ArrayList<Integer> numbers = new ArrayList<>(odd);
        System.out.println(numbers); // same as odd

        // Creating another collection, say even1
        ArrayList<Integer> even1 = new ArrayList<>();
        // Add numbers into the even1 collection
        even1.add(2);
        even1.add(4);
        even1.add(6);

        // Insert all the elements of even1 collection at the end of number collection
        numbers.addAll(even1);
        System.out.println(numbers);

        ArrayList<Integer> any = new ArrayList<>();
        // Add numbers into the "any" collection
        any.add(8);
        any.add(11);
        any.add(13);

        // Add the collection any at the 5-th location of the collection numbers
        numbers.addAll(5, any);
        // Add an object at a specific location of the collection numbers
        numbers.add(0, 0);
        System.out.println(numbers);

        // What will happen to the following?
        // numbers.add(100,999); // Uncommenting this line will cause
        // IndexOutOfBoundsException
    }
}
