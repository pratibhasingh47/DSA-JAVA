package Week_4;

import java.util.LinkedList;

public class InsertSubListToLL {
    public static void main(String[] args) {
        // Create the first LinkedList ll1
        LinkedList<String> ll1 = new LinkedList<String>();
        System.out.println("Initial list of elements: " + ll1);

        // Adding elements to ll1
        ll1.add("MP Allahabad");
        ll1.add("MP Lucknow");
        ll1.add("MP Varanasi");
        System.out.println("Initial list: " + ll1);

        // Create another LinkedList ll2
        LinkedList<String> ll2 = new LinkedList<String>();
        ll2.add("MLA Nadia");
        ll2.add("MLA Kharagpur");

        // Add all elements of ll2 to ll1
        ll1.addAll(ll2);
        System.out.println("After adding ll2 to ll1: " + ll1);

        // Create another LinkedList ll3
        LinkedList<String> ll3 = new LinkedList<String>();
        ll3.add("MLA Durgapur");
        ll3.add("MLA Howrah");

        // Insert ll3 at a specific position in ll1
        ll1.addAll(3, ll3); // Insert ll3 at location 3 of ll1
        System.out.println("After inserting ll3: " + ll1);

        // Do some normal insertions
        ll1.addFirst("President");
        ll1.addLast("Prime Minister");
        ll1.add("MP Chennai");

        // Final list
        System.out.println("The final list: " + ll1);
    }
}
