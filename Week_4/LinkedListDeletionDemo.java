package Week_4;

class LinkedListDeletionDemo {
    public static void main(String[] args) {
        JLinkedList<Integer> list = new JLinkedList<>();

        // Insert elements at the front of the LinkedList
        list.insertFront(1);
        list.insertFront(2);
        list.insertFront(3);
        list.insertFront(4);
        list.insertFront(5);
        list.insertFront(6);
        list.insertFront(7);
        list.insertFront(8);

        // Print the LinkedList
        list.printList();

        // Delete the first occurrence of key 1
        list.deleteKey(1);
        list.printList();

        // Delete the front node
        list.deleteFront();
        list.printList();

        // Delete the last node
        list.deleteEnd();
        list.printList();
    }
}
