package Week_3;

import java.util.Scanner;

public class ArrayInitializationDemo {
    int[] a = new int[100]; // Declaring a 1D array of size 100
    int size; // Actual size of the array

    void loadArray() {
        Scanner in = new Scanner(System.in); // To read from the keyboard
        System.out.println("Enter size < 100");
        size = in.nextInt(); // Read a number

        for (int i = 0; i < size; i++) {
            System.out.println("Enter " + (i + 1) + "th number ");
            a[i] = in.nextInt(); // Load the i-th entry
        }

        System.out.println("Length = " + a.length);
        for (int i = 0; i < size; i++) {
            System.out.print(a[i] + " "); // Display the array elements
        }
        System.out.println(); // Move to a new line after displaying the array
        in.close(); // Close the scanner
    }
}
