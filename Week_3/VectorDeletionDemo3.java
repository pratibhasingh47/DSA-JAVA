package Week_3;

import java.util.Vector;
import java.util.Iterator;

public class VectorDeletionDemo3 {
    public static void main(String[] args) {
        // Create a vector with an initial capacity of 7
        Vector<Integer> vec = new Vector<>(7);
        // Create another vector with an initial capacity of 4 for retaining elements
        Vector<Integer> vecRetain = new Vector<>(4);

        // Add elements to the vec vector
        vec.add(1);
        vec.add(2);
        vec.add(3);
        vec.add(4);
        vec.add(5);
        vec.add(6);
        vec.add(7);

        // Add elements to the vecRetain vector
        vecRetain.add(5);
        vecRetain.add(3);
        vecRetain.add(2);

        System.out.println("Calling retainAll()");
        // Retain only the elements in vec that are also in vecRetain
        vec.retainAll(vecRetain);

        // Print all the elements remaining in vec after retainAll
        System.out.println("Numbers after removal:");
        Iterator<Integer> itr = vec.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
