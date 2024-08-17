package Week_3;

import java.util.Vector;
import java.util.Enumeration;

public class VectorCreateDemo2 {
    public static void main(String[] args) {
        // Initial size is 3, increment is 2
        Vector<Object> v = new Vector<>(3, 2);

        System.out.println("Initial size: " + v.size());
        System.out.println("Initial capacity: " + v.capacity());

        // Adding elements
        v.addElement(1);
        v.addElement(2);
        v.addElement(3);
        v.addElement(4);

        System.out.println("Capacity after four additions: " + v.capacity());

        v.addElement(5.45);
        System.out.println("Current capacity: " + v.capacity());

        v.addElement(6.08);
        v.addElement(7);
        System.out.println("Current capacity: " + v.capacity());

        v.addElement(9.4f);
        v.addElement(10);
        System.out.println("Current capacity: " + v.capacity());

        v.addElement(11);
        v.addElement(12);

        // Accessing elements
        System.out.println("First element: " + v.firstElement());
        System.out.println("Last element: " + v.lastElement());

        // Checking if vector contains a specific element
        if (v.contains(3)) {
            System.out.println("Vector contains 3.");
        }

        // Enumerate the elements in the vector
        Enumeration<Object> vEnum = v.elements();
        System.out.println("\nElements in vector:");
        while (vEnum.hasMoreElements()) {
            System.out.print(vEnum.nextElement() + " ");
        }
        System.out.println();
    }
}
