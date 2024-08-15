package Week_3;

import java.util.Arrays;

public class CopyOfArraysDemo {
    public static void main(String[] args) {
        int[] intArr = {10, 20, 15, 22, 35}; // An input array

        // To print the elements in one line
        System.out.println("Integer Array: " + Arrays.toString(intArr));

        // Create a new array by copying with additional length
        int[] copiedArr = Arrays.copyOf(intArr, 10);

        System.out.println("\nNew Array by copyOf:\n");
        System.out.println("Integer Array: " + Arrays.toString(copiedArr));
    }
}
