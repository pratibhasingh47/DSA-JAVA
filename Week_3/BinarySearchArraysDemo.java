package Week_3;

import java.util.Arrays;

public class BinarySearchArraysDemo {
    public static void main(String[] args) {
        // Get the Array
        int[] intArr = { 10, 20, 15, 22, 35 };

        // Sort the array before performing a binary search
        Arrays.sort(intArr);

        int intKey = 22;

        // Perform binary search and print the result
        System.out.println(intKey + " found at index = " + Arrays.binarySearch(intArr, intKey));
    }
}
