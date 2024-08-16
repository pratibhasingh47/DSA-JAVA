package Week_3;

import java.util.Arrays;
import java.util.Spliterator;

public class TraverseSpliterator {
    public static void main(String[] args) {
        // Get the Array
        int[] intArr = {10, 20, 15, 22, 35};

        // Get a Spliterator from the array using IntStream
        Spliterator.OfInt spliterator = Arrays.spliterator(intArr);

        // Traverse and print the elements using the Spliterator
        System.out.println("Traversing the Integer Array using Spliterator:");
        spliterator.forEachRemaining((int value) -> System.out.println(value));
    }
}
