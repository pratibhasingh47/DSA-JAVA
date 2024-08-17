package Week_3;

import java.util.Vector;

public class VectorUpdateDemo {
    public static void main(String[] args) {
        // Create a default vector of capacity 10
        Vector<Object> v = new Vector<>();

        // Adding elements to the vector
        v.add(1);
        v.add(2);
        v.add("Mother");
        v.add("Merry");
        v.add(4);

        // Set 4 at the place of 2 (index 1)
        v.setElementAt(4, 1);

        // Print the updated vector
        System.out.println("Vector: " + v);
    }
}
