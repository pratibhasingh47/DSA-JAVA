import java.util.*;

public class TreeSetDemo {
    public static void main(String[] args) {
        // Create a tree set.
        TreeSet<String> ts = new TreeSet<>();
        // Add elements to the tree set.
        ts.add("D");
        ts.add("E");
        ts.add("B");
        ts.add("A");
        ts.add("S");
        ts.add("I");
        ts.add("S"); // Duplicate will be ignored

        // Display the elements of the tree set.
        System.out.println("TreeSet: " + ts);
    }
}
