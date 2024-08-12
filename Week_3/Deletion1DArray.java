package Week_3;

import java.util.Scanner;

public class Deletion1DArray {
    int[] a = new int[100]; // An integer array with a default capacity of 100
    int size = 0; // The number of items present

    // Method to initialize the array
    public void create(int size, Scanner scanner) {
        if (size > 100) {
            System.out.println("Could not initialize...");
            return;
        }
        this.size = size;
        try {
            for (int i = 0; i < size; i++) { // Reading the numbers
                System.out.println("Enter " + (i + 1) + "th number ");
                a[i] = scanner.nextInt(); // Load the i-th entry
            }
            System.out.println("Capacity = " + a.length + ", Size = " + size);
            printArray(); // Display the array on the screen
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }

    // Method to delete an item at a specified location
    public int delete(int loc) {
        if (size == 0) {
            System.out.println("Array is underflow: No item to delete!");
            return -1; // Return -1 to indicate no item was deleted
        }
        if ((loc < 0) || (loc >= size)) {
            System.out.println("Out of range: Deletion fails...");
            return -1; // Return -1 to indicate the deletion failed
        }

        int item = a[loc]; // The item at the specified location
        // Shifting operation to remove the element
        for (int i = loc; i < size - 1; i++) {
            a[i] = a[i + 1]; // Shift to the left by one place
        }
        a[size - 1] = 0; // Reset the last element to 0 (or any other default value)
        size--; // Decrease the size after deletion
        System.out.println("Capacity = " + a.length + ", Size = " + size);
        printArray(); // Display the array on the screen
        return item;
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
        Deletion1DArray arrayOps = new Deletion1DArray();
        Scanner in = new Scanner(System.in); // To read from the keyboard

        try {
            System.out.println("Enter the number of elements: ");
            int n = in.nextInt();
            arrayOps.create(n, in);

            System.out.println("Enter the position of the number to be deleted: ");
            int pos = in.nextInt();

            int item = arrayOps.delete(pos);
            if (item != -1) {
                System.out.println("Deleted item: " + item);
            }
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter integers only.");
        } finally {
            in.close(); // Ensure the Scanner is closed
        }
    }
}
