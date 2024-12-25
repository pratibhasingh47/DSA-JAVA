import java.util.*;

public class HashSetTraversalDemo {
    public static void main(String[] args) {
        // Create a hash set.
        Set<String> names = new HashSet<>();
        names.add("Tom");
        names.add("Mary");
        names.add("Tom"); // Duplicate, will be ignored
        names.add("John");
        names.add("Tom"); // Duplicate, will be ignored
        names.add("Bob");
        names.add("Alice");

        // Using a for-each loop to traverse the set
        for (String name : names) {
            System.out.println(name);
        }

        // Using forEach method along with a Lambda expression
        names.forEach(System.out::println);
    }
}
