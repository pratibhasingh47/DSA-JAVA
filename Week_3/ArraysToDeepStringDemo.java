package Week_3;

import java.util.Arrays;

public class ArraysToDeepStringDemo {
    public static void main(String[] args) {
        // Get the Array
        int[][] intArr = { {10, 20, 15, 22, 35} };

        // To get the deep String representation of the arrays
        System.out.println("Integer Array: " + Arrays.deepToString(intArr));
    }
}