package Week_3;

import java.util.Vector;

public class VectorStringDemo {
    public static void main(String[] args) {
        // Create a default vector with an initial capacity of 10
        Vector<Object> v = new Vector<>();

        // Add elements to the vector
        v.add(1);
        v.add(2);
        v.add("Debasis");
        v.add("Samanta");
        v.add(4);

        // Print the string equivalent of the vector
        System.out.println("String equivalent of vector: " + v.toString());
    }
}
