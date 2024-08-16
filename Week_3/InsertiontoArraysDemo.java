package Week_3;

import java.util.Arrays;

public class InsertiontoArraysDemo {
    public static void main(String[] args) {
        // Get the Array
        int[] intArr = {10, 20, 15, 22, 35};
        int intKey = 22;

        // Fill the array with the specified value
        Arrays.fill(intArr, intKey);

        // Print the filled array
        System.out.println("Integer Array after filling: " + Arrays.toString(intArr));
    }
}
