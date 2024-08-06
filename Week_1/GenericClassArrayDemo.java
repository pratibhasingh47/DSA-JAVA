package Week_1;

class GenericArray<T> {
    // Declaring an array, which should store any type T of data
    T[] a;

    // Define a constructor
    GenericArray(T[] x) {
        a = x;
    }

    // To return the element stored in the i-th place in the array
    T getData(int i) {
        return a[i];
    }

    // A generic method to print the elements in array b
    static <T> void printData(GenericArray<T> b) {
        for (int i = 0; i < b.a.length; i++) {
            System.out.print(b.getData(i) + " ");
        }
        System.out.println();
    }

    // Generic method to reverse the order of elements in array b
    static <T> void reverseArray(GenericArray<T> b) {
        int front = 0, rear = b.a.length - 1;
        while (front < rear) {
            T temp = b.a[rear];
            b.a[rear] = b.a[front];
            b.a[front] = temp;
            front++;
            rear--;
        }
    }
}

public class GenericClassArrayDemo {
    public static void main(String[] args) {
        // Creating an array of integer data
        Integer x[] = { 10, 20, 30, 40, 50 }; // It is an array of Integer numbers
        // Store the data into generic array
        GenericArray<Integer> aInt = new GenericArray<>(x);
        // Printing the data ...
        GenericArray.printData(aInt); // Printing the array of integer objects
        // Reverse ordering of data ...
        GenericArray.reverseArray(aInt);
        // Printing the data after reverse ordering ...
        GenericArray.printData(aInt); // Printing the array of integer objects after reversing

        // Creating an array of string data
        String y[] = { "A", "B", "C", "D", "E" }; // It is an array of String objects
        // Store the data into a generic array
        GenericArray<String> bString = new GenericArray<>(y);
        // Printing the data ...
        GenericArray.printData(bString); // Printing the array of string objects
        // Reverse ordering of data ...
        GenericArray.reverseArray(bString);
        // Printing the data after reverse ordering ...
        GenericArray.printData(bString); // Printing the array of string objects after reversing

        // Creating an array of double data
        Double z[] = { 1.2, 2.3, 3.4, 4.5, 5.6 }; // It is an array of double values
        // Store the data into a generic array
        GenericArray<Double> cDouble = new GenericArray<>(z);
        // Printing the data ...
        GenericArray.printData(cDouble); // Printing the array of double values
        // Reverse ordering of data ...
        GenericArray.reverseArray(cDouble);
        // Printing the data after reverse ordering ...
        GenericArray.printData(cDouble); // Printing the array of double values after reversing
    }
}
