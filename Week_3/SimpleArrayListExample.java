package Week_3;

import java.util.ArrayList;

public class SimpleArrayListExample {
    public static void main(String[] args) {
        // Creating an ArrayList of String
        ArrayList<String> animals = new ArrayList<String>();

        // Adding new elements to the ArrayList
        animals.add("Lion");
        animals.add("Tiger");
        animals.add("Cat");
        animals.add("Dog");

        // animals.add(2019); // Invalid: Type safety violation

        // Displaying the entire collection
        System.out.println(animals);
    }
}
