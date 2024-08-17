package Week_3;

import java.util.Vector;

public class VectorCreateDemo1 {
    public static void main(String[] args) {
        // Create a Vector of default size 10
        Vector<Object> v = new Vector<>();

        // Add elements of different types
        v.add(1);
        v.add(2);
        v.add("Debasis");
        v.add(3.4);
        v.add("Samanta");

        // Print the vector
        System.out.println("Vector is " + v);
    }
}
