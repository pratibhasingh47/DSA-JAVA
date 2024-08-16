package Week_3;

import java.util.Arrays;

public class CompareArraysDemo {
    public static void main(String[] args) {
        int[][] intArr1 = {{10, 20, 15, 22, 35}}; // An input array
        int[][] intArr2 = {{10, 15, 22}}; // Another input array

        // To compare both arrays
        System.out.println("Integer Arrays comparison: " + Arrays.deepEquals(intArr1, intArr2));
    }
}
