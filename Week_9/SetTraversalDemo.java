import java.util.*;

public class SetTraversalDemo {
    public static void main(String[] args) {
        Set<String> pLangs = new HashSet<>();
        pLangs.add("C");
        pLangs.add("C++");
        pLangs.add("Java");
        pLangs.add("Python");
        pLangs.add("PHP");
        pLangs.add("R");

        // Using simple for-each loop to traverse the set
        for (String pl : pLangs) {
            System.out.println(pl);
        }
    }
}
