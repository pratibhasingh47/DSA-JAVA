import java.util.*;

class HashSetCollectionDemo {
    public static void main(String[] args) {
        // Creating a hash set from a collection
        List<Integer> list = Arrays.asList(3, 9, 2, 4, 6, 2, 5, 3, 8, 9, 1, 7, 8, 6);
        System.out.println("List: " + list);

        // Create a HashSet from the list
        HashSet<Integer> uniqueNumbers = new HashSet<>(list);
        System.out.println("Unique Numbers: " + uniqueNumbers);

        // Creating a large set
        Set<Integer> bigSet = new HashSet<>(1000);
        for (int i = 0; i < 1000; i++) {
            bigSet.add((int) (Math.random() * 1000));
        }

        // Check if 555 is in the big set
        System.out.println("Is 555 in the bigSet? " + bigSet.contains(555));
    }
}
