package Week_3;

import java.util.Vector;

public class VectorCopyDemo {
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

        // Create an array of Integers with the same size as the vector
        Integer[] arr = new Integer[vec.size()];

        // Copy the vector into the array
        vec.copyInto(arr);

        // Print the elements in the array
        System.out.println("Elements in array arr:");
        for (Integer num : arr) {
            System.out.println(num);
        }
    }
}
