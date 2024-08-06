package Week_1;

class SpecificArrayString {
    // Declaring an array of String values
    String[] c;

    // Constructor to load the array
    SpecificArrayString(String[] c) {
        this.c = c;
    }

    // Method to print the array elements
    void printString() {
        for (String x : c) {
            System.out.println(x);
        }
    }

    // Method to reverse the array elements
    void reverseString() {
        int j = c.length - 1;
        for (int i = 0; i < j; i++, j--) {
            String temp = c[i];
            c[i] = c[j];
            c[j] = temp;
        }
    }
}

public class MainClassString {
    public static void main(String[] args) {
        // Create an instance of SpecificArrayString with given elements
        String[] array = { "A", "B", "C", "D", "E" };
        SpecificArrayString c = new SpecificArrayString(array);

        // Print the original array
        System.out.println("Original array:");
        c.printString();

        // Reverse the array
        c.reverseString();

        // Print the reversed array
        System.out.println("Reversed array:");
        c.printString();
    }
}
