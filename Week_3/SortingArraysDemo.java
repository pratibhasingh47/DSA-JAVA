package Week_3;

import java.util.Arrays;

public class SortingArraysDemo {
    public static void main(String[] args) {
        // Get the Array
        int[] intArr = {10, 20, 15, 22, 35};

        // To sort the array using normal sort
        Arrays.sort(intArr);

        // Print the sorted array
        System.out.println("Sorted Integer Array: " + Arrays.toString(intArr));
    }
}
