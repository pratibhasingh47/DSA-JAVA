package Week_3;

import java.util.Scanner;

public class ArrayInitializationRandomDemo {
    int[] a = new int[100]; // Declaring a 1D array of size 100
    int size; // Actual size of the array
    final int MIN = 1, MAX = 100; // Range of the numbers

    // Generating a random number within a specified range
    int generateRandom(int min, int max) {
        int rand = (int) (Math.random() * ((max - min) + 1)) + min;
        return rand;
    }

    public static void main(String[] args) {
        ArrayInitializationRandomDemo demo = new ArrayInitializationRandomDemo();
        Scanner in = new Scanner(System.in); // To read the size from the user

        System.out.println("Enter size < 100");
        demo.size = in.nextInt(); // Read a number from the keyboard

        for (int i = 0; i < demo.size; i++) {
            demo.a[i] = demo.generateRandom(demo.MIN, demo.MAX); // Generate and store a random number
        }

        System.out.println("Capacity = " + demo.a.length + " Size = " + demo.size);
        for (int i = 0; i < demo.size; i++) {
            System.out.print(demo.a[i] + " "); // Display the array elements
        }
        System.out.println(); // New line after printing array elements

        in.close(); // Close the scanner
    }
}
