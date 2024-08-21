package Week_4;

public class LinkedListMergingDemo {
    public static void main(String[] args) {
        // Create two JLinkedList instances for Integer type
        JLinkedList<Integer> list1 = new JLinkedList<>();
        JLinkedList<Integer> list2 = new JLinkedList<>();

        // Populate the first list
        list1.insertFront(1);
        list1.insertFront(2);
        list1.insertEnd(3);
        list1.insertEnd(4);
        System.out.print("List 1: ");
        list1.printList();

        // Populate the second list
        list2.insertFront(5);
        list2.insertEnd(6);
        System.out.print("List 2: ");
        list2.printList();

        // Merge the second list into the first list
        list1.merge(list2);
        System.out.println("Merged List: ");
        list1.printList();
    }
}
