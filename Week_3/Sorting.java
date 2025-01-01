package Week_3;

import java.util.*;

// A class to represent a student.
class Student {
    int rollno;
    String name, address;

    // Constructor
    public Student(int rollno, String name, String address) {
        this.rollno = rollno;
        this.name = name;
        this.address = address;
    }

    // Overriding toString() method for meaningful output
    @Override
    public String toString() {
        return this.rollno + " " + this.name + " " + this.address;
    }
}

// Comparator class for sorting by roll number
class Sortbyroll implements Comparator<Student> {
    // Used for sorting in ascending order of roll number
    public int compare(Student a, Student b) {
        return a.rollno - b.rollno;
    }
}

// Main class for demonstrating sorting
public class Sorting {
    public static void main(String[] args) {
        Student[] arr = {
                new Student(111, "bbbb", "london"),
                new Student(131, "aaaa", "nyc"),
                new Student(121, "cccc", "jaipur")
        };

        System.out.println("Unsorted:");
        for (Student student : arr) {
            System.out.println(student);
        }

        // Sorting by roll number from index 1 to 2 (index 3 is exclusive)
        Arrays.sort(arr, 1, 3, new Sortbyroll());

        System.out.println("\nSorted by roll number:");
        for (Student student : arr) {
            System.out.println(student);
        }
    }
}
