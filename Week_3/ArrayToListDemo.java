package Week_3;

import java.util.Arrays;
import java.util.List;

public class ArrayToListDemo {
    public static void main(String[] args) {
        int[] intArr = {10, 20, 15, 22, 35}; // An array of int

        // Convert the int array to an Integer array
        Integer[] intArrWrapper = Arrays.stream(intArr).boxed().toArray(Integer[]::new);

        // Convert the Integer array to a List
        List<Integer> intList = Arrays.asList(intArrWrapper);

        System.out.println("Integer Array as List: " + intList);
    }
}
