package Week_3;

import java.util.ArrayList;
import java.util.Vector;

public class VectorInsertionDemo3 {
    public static void main(String[] args) {
        // Create an ArrayList
        ArrayList<Object> arr = new ArrayList<>();

        // Add elements to the ArrayList
        arr.add(3);
        arr.add("Oracle");
        arr.add("Java");
        arr.add(4);

        // Create a default Vector
        Vector<Object> v = new Vector<>();

        // Copy all elements of the ArrayList into the Vector
        v.addAll(arr);

        // Print the Vector
        System.out.println("Vector v: " + v);
    }
}
