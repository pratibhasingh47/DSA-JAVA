package Week_3;

import java.util.Vector;

public class VectorInsertionDemo2 {
    public static void main(String[] args) {
        // Create a vector with initial capacity of 5
        Vector<Object> v = new Vector<>(5);

        // Add elements at specific indices
        v.add(1); // Add 1 at index 0 (corrected from the original code)
        v.add(2); // Add 2 at index 1
        v.add(2); // Add 2 at index 1
        v.add(0, "Debais"); // Add "Debasis" at index 0, shifting existing elements
        v.add(3, "Samanta"); // Add "Samanta" at index 3
        v.add(4, 3); // Add 3 at index 4
        v.add(5, 6.9); // Add 6.9 at index 5 (Vector grows automatically)

        // Insert 7 at index 6 (corrected the index to be within bounds)
        v.insertElementAt(10, 6);

        // Print the vector
        System.out.println("Vector is " + v);
    }
}





