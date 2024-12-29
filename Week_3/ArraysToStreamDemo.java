package Week_3;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ArraysToStreamDemo {
    public static void main(String[] args) {
        // Get the Array
        int[] intArr = { 10, 20, 15, 22, 35 };

        // To get the Stream from the array
        IntStream intStream = Arrays.stream(intArr);

        // Convert the stream to a String representation for display
        String streamAsString = intStream.mapToObj(String::valueOf).reduce((a, b) -> a + ", " + b).orElse("");

        System.out.println("Integer Array as Stream: [" + streamAsString + "]");
    }
}
