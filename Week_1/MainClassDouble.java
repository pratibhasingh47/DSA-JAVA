package Week_1;

class SpecificArrayDouble {
    // Declaring an array of double values
    double[] b;

    // Constructor to load the array
    SpecificArrayDouble(double[] b) {
        this.b = b;
    }

    // Method to print the array elements
    void printDouble() {
        for (double x : b) {
            System.out.println(x);
        }
    }

    // Method to reverse the array elements
    void reverseDouble() {
        int j = b.length - 1;
        for (int i = 0; i < j; i++, j--) {
            double temp = b[i];
            b[i] = b[j];
            b[j] = temp;
        }
    }
}

public class MainClassDouble {
    public static void main(String[] args) {
        // Create an instance of SpecificArrayDouble with given elements
        double[] array = { 1.2, 2.3, 3.4, 4.5, 5.6 };
        SpecificArrayDouble b = new SpecificArrayDouble(array);

        // Print the original array
        System.out.println("Original array:");
        b.printDouble();

        // Reverse the array
        b.reverseDouble();

        // Print the reversed array
        System.out.println("Reversed array:");
        b.printDouble();
    }
}
