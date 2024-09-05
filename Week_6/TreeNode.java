package Week_6;

public class TreeNode<T extends Comparable<T>> {
    T element;
    TreeNode<T> left;
    TreeNode<T> right;

    // Constructor with an element
    public TreeNode(T element) {
        this.element = element;
        this.left = null;
        this.right = null;
    }

    // Default constructor
    public TreeNode() {
        this.element = null;
        this.left = null;
        this.right = null;
    }

    // Getter for the element
    public T getElement() {
        return element;
    }

    // Setter for the element
    public void setElement(T element) {
        this.element = element;
    }

    // Getter for the left child
    public TreeNode<T> getLeft() {
        return left;
    }

    // Setter for the left child
    public void setLeft(TreeNode<T> left) {
        this.left = left;
    }

    // Getter for the right child
    public TreeNode<T> getRight() {
        return right;
    }

    // Setter for the right child
    public void setRight(TreeNode<T> right) {
        this.right = right;
    }

    // Method to check if the node is a leaf
    public boolean isLeaf() {
        return (left == null && right == null);
    }

    // Method to check if the node has only one child
    public boolean hasOneChild() {
        return (left == null && right != null) || (left != null && right == null);
    }

    // Method to check if the node has two children
    public boolean hasTwoChildren() {
        return (left != null && right != null);
    }
}
