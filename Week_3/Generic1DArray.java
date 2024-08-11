package Week_3;

import java.util.Arrays;

public class Generic1DArray<T> {
    private T[] x; // x is an array of generic type T

    // Constructor
    @SafeVarargs
    public Generic1DArray(T... t) {
        x = t;
    }

    // A recursive method to reverse the ordering of array x
    public void reverse1D(int length) {
        if (length > 1) { // Termination condition check
            // Swap the end elements
            T temp = x[x.length - length];
            x[x.length - length] = x[length - 1];
            x[length - 1] = temp;
            reverse1D(length - 1); // Do recursively for the next level
        }
    }

    @Override
    public String toString() {
        return Arrays.toString(x);
    }
}
