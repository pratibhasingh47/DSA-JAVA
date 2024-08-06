package Week_1;

// Define the user defined Student class
class Student {
    String name; // Name of the student
    int[] marks; // Stores the marks in three subjects

    // Constructor for the class Student
    Student(String s, int[] m) {
        name = s;
        marks = m;
    }

    // Defining a method to print student’s record
    void printStudent() {
        System.out.println("Name: " + name);
        System.out.println("Scores: " + marks[0] + " " + marks[1] + " " + marks[2]);
    }
} // End of the class Student

// Defining a generic array with two type parameters
class GenericMultiArrays<T, S> {
    // Declaring arrays, which should store any type T and S of data
    T[] a; // Define that the array a can store one type of data
    S[] b; // Define that the array b can store another type of data

    // Constructor
    GenericMultiArrays(T[] x, S[] y) {
        a = x;
        b = y;
    }

    T getDataT(int i) { // To return the element stored in i-th place in the array
        return a[i];
    }

    S getDataS(int i) { // To return the element stored in i-th place in the array
        return b[i];
    }

    // Overloaded methods in the generic class
    void printData(T[] t) { // A generic method to print the elements in array t
        for (T element : t) {
            System.out.print(element + " ");
        }
        System.out.println(); // Print a new line
    }

    void printData(S[] s) { // An overloaded generic method to print elements in s
        for (S element : s) {
            if (element instanceof Student) {
                ((Student) element).printStudent(); // Print the i-th student in s
            } else {
                System.out.println(element);
            }
        }
        System.out.println(); // Print a new line
    }

    // Few additional methods
    void reverseArray(T[] t) { // Generic method to reverse the order of elements in t
        int front = 0, rear = t.length - 1;
        while (front < rear) {
            T temp = t[rear];
            t[rear] = t[front];
            t[front] = temp;
            front++;
            rear--;
        }
    }

    void reverseArray(S[] s) { // Generic method to reverse the order of elements in s
        int front = 0, rear = s.length - 1;
        while (front < rear) {
            S temp = s[rear];
            s[rear] = s[front];
            s[front] = temp;
            front++;
            rear--;
        }
    }
}

// Driver class is programmed below
public class GenericMultiArraysDemo {
    public static void main(String args[]) {
        // Creating an array of String data
        String t[] = { "A", "B", "C" }; // It is an array of String data

        // Creating an array of Students’ data
        Student s[] = new Student[3]; // It is an array of Student data
        s[0] = new Student("Ram", new int[] { 86, 66, 96 });
        s[1] = new Student("Rahim", new int[] { 88, 99, 77 });
        s[2] = new Student("John", new int[] { 75, 85, 95 });

        // Store the data into generic arrays
        GenericMultiArrays<String, Student> arrayData = new GenericMultiArrays<>(t, s);

        // Printing the data ...
        arrayData.printData(t); // Printing the array of strings
        arrayData.printData(s); // Printing the student’s data

        // Reverse ordering of data ...
        arrayData.reverseArray(t);
        arrayData.reverseArray(s);

        // Printing the data after reverse ordering ...
        arrayData.printData(t); // Printing the array of strings
        arrayData.printData(s); // Printing the array of students
    }
}
