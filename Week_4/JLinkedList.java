package Week_4;

import java.io.*;
import java.util.*;

// Java program to implement a Singly Linked List
public class JLinkedList<T> {
    private Node head; // Head of the list

    // Inner class Node
    private class Node {
        T data;
        Node next;

        // Default constructor
        Node() {
            data = null;
            next = null;
        }

        // Constructor with data
        Node(T d) {
            data = d;
            next = null;
        }
    }

    // Constructor for JLinkedList
    public JLinkedList() {
        // Initialize head with a dummy node
        head = new Node();
    }

    // Method to insert at the front of the list
    public void insertFront(T data) {
        // Create a new node with given data
        Node newNode = new Node(data);
        newNode.next = head.next;
        // Make the new node as the first node
        head.next = newNode;
    }

    // Additional methods to be defined …
}
