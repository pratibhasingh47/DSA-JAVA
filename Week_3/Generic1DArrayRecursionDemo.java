package Week_3;

public class Generic1DArrayRecursionDemo {
    public static void main(String args[]) {
        // Case 1: Working with integer array
        Generic1DArray<Integer> intA = new Generic1DArray<>(1, 2, 3, 4, 5, 6);
        intA.reverse1D(6); // Reversing the array intA
        System.out.println(intA); // Print the result

        // Case 2: Working with String array
        Generic1DArray<String> stringA = new Generic1DArray<>("A", "E", "I", "O", "U");
        stringA.reverse1D(5); // Reversing the array stringA
        System.out.println(stringA); // Print the result
    }
}
