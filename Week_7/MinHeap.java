package Week_7;

public class MinHeap<T extends Comparable<T>> {
    private T[] Heap;
    private int size;
    private int maxsize;
    private static final int FRONT = 1;

    // Constructor
    @SuppressWarnings("unchecked")
    public MinHeap(T[] arr, T node) {
        this.maxsize = arr.length - 1; // Set maxsize to account for 0 index not being used
        this.size = 0;
        Heap = (T[]) new Comparable[arr.length]; // Create a heap of Comparable type
        Heap[0] = node; // Dummy node, not used in heap operations
    }

    // Returns the parent index
    private int parent(int pos) {
        return pos / 2;
    }

    // Returns the left child index
    private int leftChild(int pos) {
        return 2 * pos;
    }

    // Returns the right child index
    private int rightChild(int pos) {
        return (2 * pos) + 1;
    }

    // Returns true if the node is a leaf
    private boolean isLeaf(int pos) {
        return pos >= (size / 2) && pos <= size;
    }

    // Swap two nodes
    private void swap(int fpos, int spos) {
        T tmp;
        tmp = Heap[fpos];
        Heap[fpos] = Heap[spos];
        Heap[spos] = tmp;
    }

    // Print the heap
    public void print() {
        for (int i = 1; i <= size / 2; i++) {
            System.out.print("PARENT: " + Heap[i]
                    + " LEFT CHILD: " + Heap[2 * i]
                    + " RIGHT CHILD: " + ((2 * i + 1) <= size ? Heap[2 * i + 1] : "NULL"));
            System.out.println();
        }
    }

    // Heapify the node at position pos
    private void minHeapify(int pos) {
        if (!isLeaf(pos)) {
            int left = leftChild(pos);
            int right = rightChild(pos);
            int smallest = pos;

            if (left <= size && Heap[left].compareTo(Heap[smallest]) < 0) {
                smallest = left;
            }
            if (right <= size && Heap[right].compareTo(Heap[smallest]) < 0) {
                smallest = right;
            }

            if (smallest != pos) {
                swap(pos, smallest);
                minHeapify(smallest);
            }
        }
    }

    // Insert an element into the heap
    public void insert(T element) {
        if (size >= maxsize) {
            System.out.println("Heap is full");
            return;
        }
        Heap[++size] = element;
        int current = size;

        while (current > 1 && Heap[current].compareTo(Heap[parent(current)]) < 0) {
            swap(current, parent(current));
            current = parent(current);
        }
    }

    // Remove and return the minimum element (root)
    public T remove() {
        if (size == 0) {
            System.out.println("Heap is empty");
            return null;
        }
        T popped = Heap[FRONT];
        Heap[FRONT] = Heap[size--];
        minHeapify(FRONT);
        return popped;
    }

    // Build a min heap from existing elements
    public void minHeap() {
        for (int pos = size / 2; pos >= 1; pos--) {
            minHeapify(pos);
        }
    }

    // Main method to test the MinHeap
    public static void main(String[] arg) {
        System.out.println("The Min Heap is ");
        Integer[] a = new Integer[15];
        MinHeap<Integer> minHeap = new MinHeap<>(a, 0); // Dummy node (index 0) isn't used in heap operations

        minHeap.insert(5);
        minHeap.insert(3);
        minHeap.insert(17);
        minHeap.insert(10);
        minHeap.insert(84);
        minHeap.insert(19);
        minHeap.insert(6);
        minHeap.insert(22);
        minHeap.insert(9);

        minHeap.minHeap();
        minHeap.print();

        System.out.println("The Min val is " + minHeap.remove());
    }
}
