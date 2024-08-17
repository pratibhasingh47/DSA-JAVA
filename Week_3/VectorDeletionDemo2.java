package Week_3;

import java.util.Vector;

public class VectorDeletionDemo2 {
    public static void main(String[] args) {
        // Create a default Vector with an initial capacity of 10
        Vector<Object> v = new Vector<>();

        // Add elements to the Vector
        v.add(1);
        v.add(2);
        v.add("India");
        v.add("Japan");
        v.add(4);

        // Remove the element at index 0
        v.removeElementAt(0);
        System.out.println("After removal: " + v);

        // Remove the element "Japan"
        v.removeElement("Japan");
        System.out.println("After removal: " + v);
    }
}
