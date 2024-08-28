package Week_5;

import java.util.Arrays;

public class StackA<T> {
    private T[] data;
    private int length;
    private int top;

    @SuppressWarnings("unchecked")
    public StackA(int size) {
        data = (T[]) new Object[size]; // Initialize array with specified size
        length = size;
        top = -1;
    }

    // Method to add an element to the stack
    public void push(T element) {
        if (top == length - 1) {
            System.out.println("Stack overflow! Cannot add element: " + element);
            return;
        }
        data[++top] = element;
    }

    // Method to remove and return the top element from the stack
    public T pop() {
        if (isEmpty()) {
            System.out.println("Stack underflow! Cannot remove element.");
            return null;
        }
        return data[top--];
    }

    // Method to check if the stack is empty
    public boolean isEmpty() {
        return top == -1;
    }

    // Method to print the current stack
    public void printStack() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return;
        }
        System.out.println("Stack elements: " + Arrays.toString(Arrays.copyOfRange(data, 0, top + 1)));
    }

    public static void main(String[] args) {
        StackA<Integer> stack = new StackA<>(5);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.printStack(); // Output: Stack elements: [10, 20, 30]
        stack.pop();
        stack.printStack(); // Output: Stack elements: [10, 20]
        System.out.println("Is stack empty? " + stack.isEmpty()); // Output: false
    }
}
