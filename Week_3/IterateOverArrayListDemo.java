package Week_3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IterateOverArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> tvShows = new ArrayList<>();

        // Adding elements to the ArrayList
        tvShows.add("Nimki Mukhiya");
        tvShows.add("Game of Thrones");
        tvShows.add("Mahabharat");
        tvShows.add("Balika Badhu");

        // Traversing using forEach() and lambda
        System.out.println("Traversing using forEach() and lambda:");
        tvShows.forEach(tvShow -> System.out.println(tvShow));

        // Iterate using an iterator
        System.out.println("\n=== Iterate using an iterator() ===");
        Iterator<String> tvShowIterator = tvShows.iterator();
        while (tvShowIterator.hasNext()) {
            String tvShow = tvShowIterator.next();
            System.out.println(tvShow);
        }

        // Traversing using iterator() and forEachRemaining()
        System.out.println("\nTraversing using iterator() and forEachRemaining():");
        tvShowIterator = tvShows.iterator();
        tvShowIterator.forEachRemaining(tvShow -> System.out.println(tvShow));

        // Traversing using a listIterator()
        System.out.println("\nTraversing using a listIterator() backwards:");
        ListIterator<String> tvShowListIterator = tvShows.listIterator(tvShows.size());
        while (tvShowListIterator.hasPrevious()) {
            String tvShow = tvShowListIterator.previous();
            System.out.println(tvShow);
        }

        // Iterate using simple for-each loop
        System.out.println("\n=== Iterate using simple for-each loop ===");
        for (String tvShow : tvShows) {
            System.out.println(tvShow);
        }

        // Iterate using for loop with index
        System.out.println("\n=== Iterate using for loop with index ===");
        for (int i = 0; i < tvShows.size(); i++) {
            System.out.println(tvShows.get(i));
        }
    }
}
