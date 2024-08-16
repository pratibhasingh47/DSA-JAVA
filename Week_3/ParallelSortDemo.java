package Week_3;

import java.util.Arrays;

public class ParallelSortDemo {
    public static void main(String[] args) {
        // Get the Array
        int[] intArr = {10, 20, 15, 22, 35};

        // To sort the array using parallelSort
        Arrays.parallelSort(intArr);

        // Print the sorted array
        System.out.println("Sorted Integer Array using parallelSort: " + Arrays.toString(intArr));
    }
}
