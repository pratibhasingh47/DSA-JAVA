package Week_3;

import java.util.Vector;

public class VectorCheckDemo {
    public static void main(String[] args) {
        // Create and populate the first vector
        Vector<Object> v = new Vector<>();
        v.add(1);
        v.add(2);
        v.add("Oracle");
        v.add("Java");
        v.add(4);

        // Create and populate the second vector
        Vector<Object> v_2nd = new Vector<>();
        v_2nd.add(1);
        v_2nd.add(2);
        v_2nd.add("Java");
        v_2nd.add("Oracle");
        v_2nd.add(4);

        // Check if both vectors are equal
        if (v.equals(v_2nd)) {
            System.out.println("Both vectors are equal");
        } else {
            System.out.println("Both vectors are not equal");
        }
    }
}
