package Week_4;

public class LinkedListInsertionDemo {
    public static void main(String[] args) {
        // Create a new JLinkedList instance for Integer type
        JLinkedList<Integer> list = new JLinkedList<>();

        // Insert elements at the end and front of the list
        list.insertEnd(9);
        list.printList();
        list.insertFront(5);
        list.printList();
        list.insertEnd(10);
        list.printList();
        list.insertKey(7, 5); // Assuming insertKey inserts after a given key
        list.printList();
        list.insertKey(12, 0); // Insert before the first element
        list.printList();
        list.insertKey(13, 10); // Insert after the last element
        list.printList();
        list.insertFront(2);
        list.printList();
    }
}
