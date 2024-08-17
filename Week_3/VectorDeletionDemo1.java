package Week_3;

import java.util.Vector;

public class VectorDeletionDemo1 {
    public static void main(String[] args) {
        // Create a default Vector with initial capacity of 10
        Vector<Object> v = new Vector<>();

        // Add elements to the Vector
        v.add(0, 1);
        v.add(1, 2);
        v.add(2, "IIT");
        v.add(3, "Kharagpur");
        v.add(4, 3);

        // Print the Vector
        System.out.println("Vector is: " + v);

        // Clear the Vector
        v.clear();

        // Print the Vector after clearing
        System.out.println("After clearing: " + v);
    }
}
