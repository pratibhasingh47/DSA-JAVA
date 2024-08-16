package Week_3;

import java.util.Arrays;

public class ArraysOfHashcodeDemo {
    public static void main(String[] args) {
        // Get the Array
        int[][] intArr = {{10, 20, 15, 22, 35}};

        // To get the deep hashCode of the arrays
        System.out.println("Integer Array deep hashCode: " + Arrays.deepHashCode(intArr));
    }
}
