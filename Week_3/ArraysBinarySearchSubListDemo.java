package Week_3;

import java.util.Arrays;

public class ArraysBinarySearchSubListDemo {
    public static void main(String[] args) {
        int[] intArr = {10, 20, 15, 22, 35}; // An int array as input

        // Sort the array
        Arrays.sort(intArr);

        int intKey = 22;

        // Perform binary search on a sublist from index 1 to 2 (3 is exclusive)
        int resultIndex = Arrays.binarySearch(intArr, 1, 3, intKey);

        // Print the result
        System.out.println(intKey + " found at index = " + resultIndex);
    }
}
