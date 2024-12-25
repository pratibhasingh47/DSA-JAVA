import java.util.*;

public class DifferentSetDemo {
    public static void main(String[] args) {
        // Create a hash set.
        HashSet<String> hs = new HashSet<>();
        // Add elements to the hash set.
        hs.add("A");
        hs.add("B");
        hs.add("C");
        hs.add("D");
        hs.add("E");
        hs.add("F");
        System.out.println("HashSet: " + hs);

        // Create a linked hash set.
        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        // Add elements to the linked hash set.
        lhs.add("A");
        lhs.add("B");
        lhs.add("C");
        lhs.add("D");
        lhs.add("E");
        lhs.add("F");
        System.out.println("LinkedHashSet: " + lhs);
    }
}
