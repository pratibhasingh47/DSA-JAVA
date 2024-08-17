package Week_3;

import java.util.Vector;

public class VectorHashcodeDemo {
    public static void main(String[] args) {
        // Create a vector with an initial capacity of 7
        Vector<Integer> vec = new Vector<>(7);

        // Add elements to the vector
        vec.add(1);
        vec.add(2);
        vec.add(3);
        vec.add(4);
        vec.add(5);
        vec.add(6);
        vec.add(7);

        // Print the hash code of the vector
        System.out.println("Hash code: " + vec.hashCode());
    }
}
