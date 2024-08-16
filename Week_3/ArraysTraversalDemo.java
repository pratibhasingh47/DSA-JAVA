package Week_3;

import java.util.Arrays;
import java.util.Spliterator;

public class ArraysTraversalDemo {
    public static void main(String[] args) {
        // Get the Array
        int[] intArr = {10, 20, 15, 22, 35};

        // Create a Spliterator for the entire array
        Spliterator.OfInt spliterator = Arrays.spliterator(intArr);

        // Print the subset using the Spliterator
        System.out.println("Integer Array subset using Spliterator:");

        // Define the range
        final int start = 1;
        final int end = 3;

        // Use an array to keep track of the index
        final int[] index = {0};

        // Traverse using tryAdvance
        spliterator.forEachRemaining((int value) -> {
            if (index[0] >= start && index[0] < end) {
                System.out.println(value);
            }
            index[0]++;
        });
    }
}
