package Week_3;

import java.util.Scanner;

public class Insertion1DArray {
    int[] a = new int[100]; // An integer array with a default capacity of 100
    int size = 0; // The number of items present

    // Method to initialize the array
    public void create(int size) {
        if (size > 100) {
            System.out.println("Could not initialize…");
            return;
        }
        this.size = size;
        Scanner in = new Scanner(System.in); // To read from the keyboard
        for (int i = 0; i < size; i++) { // Reading the numbers
            System.out.println("Enter " + (i + 1) + "th number ");
            a[i] = in.nextInt(); // Load the i-th entry
        }
        System.out.println("Capacity = " + a.length + ", Size = " + size);
        printArray(); // Display the array on the screen
        in.close();
        
    }

    // Method to insert an element at a specific location in the array
    public void insert(int item, int loc) {
        if (size == a.length) {
            System.out.println("Array is overflow: Insertion fails…");
            return;
        }
        if ((loc < 0) || (loc > size)) {
            System.out.println("Out of range: Insertion fails…");
            return;
        }
        // Shifting operation to make room for the new element
        for (int i = size; i > loc; i--) {
            a[i] = a[i - 1]; // Shift to the right one place
        }
        a[loc] = item; // Insert the new element at the specified location
        size++; // Increase the size after insertion
        System.out.println("Capacity = " + a.length + ", Size = " + size);
        printArray(); // Display the array on the screen
    }

    // Method to print the array
    public void printArray() {
        for (int i = 0; i < size; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    // Main method
    public static void main(String[] args) {
        Insertion1DArray arrayOps = new Insertion1DArray();
        Scanner in = new Scanner(System.in); // To read from the keyboard

        System.out.println("Enter the number of elements: ");
        int n = in.nextInt();
        arrayOps.create(n);

        System.out.println("Enter the new number to be inserted: ");
        int item = in.nextInt();
        System.out.println("At position? ");
        int pos = in.nextInt();

        arrayOps.insert(item, pos);
        in.close();
    }
}
