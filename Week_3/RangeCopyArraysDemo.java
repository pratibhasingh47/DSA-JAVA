package Week_3;

import java.util.Arrays;

public class RangeCopyArraysDemo {
    public static void main(String[] args) {
        int[] intArr = { 10, 20, 15, 22, 35 }; // Get an array of int

        // To print the elements in one line
        System.out.println("Integer Array: " + Arrays.toString(intArr));

        // To copy a range of the array into a new array
        System.out.println("\nNew Array by copyOfRange:\n");

        // Copy elements from index 1 to 2 (3 is exclusive)
        int[] rangeArr = Arrays.copyOfRange(intArr, 1, 3);

        System.out.println("Integer Array: " + Arrays.toString(rangeArr));
    }
}
