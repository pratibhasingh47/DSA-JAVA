package Week_3;

import java.util.Vector;

public class VectorInsertionDemo1 {
    public static void main(String[] args) {
        // Create a Vector with initial capacity of 7
        Vector<Integer> vec = new Vector<>(7);

        // Use add() method to add elements to the vector
        vec.add(1);
        vec.add(2);
        vec.add(3);
        vec.add(4);
        vec.add(5);
        vec.add(6);
        vec.add(7);

        // Insert 10 at index 7
        vec.insertElementAt(10, 7);

        // Check and print the vector
        System.out.println("Vector: " + vec);
    }
}
