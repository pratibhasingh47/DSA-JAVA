package Week_3;

import java.util.Arrays;

public class SortingSublistDemo {
    public static void main(String[] args) {
        // Get the Array
        int[] intArr = {10, 20, 15, 22, 35};

        // To sort a sublist of the array (index 1 to 2, 3 is exclusive)
        Arrays.sort(intArr, 1, 3);

        // Print the partially sorted array
        System.out.println("Partially Sorted Integer Array: " + Arrays.toString(intArr));
    }
}