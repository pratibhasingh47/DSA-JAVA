package Week_3;

import java.util.Vector;

public class VectorCloningDemo {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        // Create and populate the original vector
        Vector<Object> v = new Vector<>();
        v.add(0, 1);
        v.add(1, 2);
        v.add(2, "Oracle");
        v.add(3, "Java");
        v.add(4, 3);

        // Clone the original vector
        Vector<Object> v_clone = (Vector<Object>) v.clone();

        // Print the cloned vector
        System.out.println("Clone of v: " + v_clone);
    }
}
