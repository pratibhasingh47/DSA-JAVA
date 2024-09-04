package Week_6;

import java.util.PriorityQueue;

class Book implements Comparable<Book> {
    int bookId;
    String name;
    String author;
    String publisher;
    int quantity;

    // Constructor to initialize the Book object
    public Book(int id, String name, String author, String pub, int qty) {
        this.bookId = id;
        this.name = name;
        this.author = author;
        this.publisher = pub;
        this.quantity = qty;
    }

    // Implementing the compareTo method to compare books by their ID
    @Override
    public int compareTo(Book other) {
        return Integer.compare(this.bookId, other.bookId);
    }

    // Method to display book details
    @Override
    public String toString() {
        return "Book [ID=" + bookId + ", Name=" + name + ", Author=" + author +
                ", Publisher=" + publisher + ", Quantity=" + quantity + "]";
    }
}

public class QueueCreateDemo {
    public static void main(String[] args) {
        // Creating a PriorityQueue of Book objects
        PriorityQueue<Book> queue = new PriorityQueue<>();

        // Creating Books
        Book b1 = new Book(111, "Joy with Java", "Debasis Samanta", "Elsevier", 8);
        Book b2 = new Book(222, "Complete Java", "Herbert Schildt", "Oracle", 6);
        Book b3 = new Book(333, "Headstart Java", "Forouzan", "O’Reilly", 4);

        // Adding Books to the queue
        queue.add(b1);
        queue.add(b2);
        queue.add(b3);

        System.out.println("Traversing the queue elements:");
        // Traversing the queue with a for-each loop
        for (Book b : queue) {
            System.out.println(b.bookId + " " + b.name + " " + b.author + " " + b.publisher + " " + b.quantity);
        }

        // Removing a book from the queue
        queue.remove();
        System.out.println("After removing one book record:");

        // Adding another book into the queue
        queue.add(new Book(555, "Classic Data Structures", "D. Samanta", "Prentice Hall", 9));

        // Traversing the queue again
        for (Book b : queue) {
            System.out.println(b.bookId + " " + b.name + " " + b.author + " " + b.publisher + " " + b.quantity);
        }
    }
}
