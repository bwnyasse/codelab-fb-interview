package leetcode.Amazon.binarytree;

/**
 * Implementation of a binary tree in Java.
 * 
 * Example with Sorted binary tree that will contain int values
 */
public class BinaryTree {

    class Node {
        int value;
        Node left;
        Node right;

        Node(int value) {
            this.value = value;
            right = null;
            left = null;
        }
    }

    private Node root;

    public Node add(int value) {
        return addRecursive(root, value);
    }

    public boolean contains(int value) {
        return containsNodeRecursive(root, value);
    }

    public Node delete(int value) {
        return  deleteRecursive(root, value);
    }

    /**
     * Inserting Elements
     * 
     * if the new node’s value is lower than the current node’s, we go to the lef
     *  child
     * 
     * if the new node’s value is greater than the current node’s, we go to the
     * right child
     * 
     * when the current node is null, we’ve reached a leaf node and we can insert
     * the new node in that position
     * 
     * @param current
     * @param value
     * @return
     */
    private Node addRecursive(Node current, int value) {

        if (current == null) {
            // leaf
            return new Node(value);
        }

        if (value < current.value) {
            // Go Left
            current.left = addRecursive(current.left, value);
        } else if (value > current.value) {
            // Go Right
            current.right = addRecursive(current.right, value);
        } else {
            // already check
            return current;
        }

        return current;
    }

    /**
     * Finding an Element
     * 
     * Method to check if the tree contains a specific value.
     */
    private boolean containsNodeRecursive(Node current, int value) {

        if (current == null) {
            return false;
        }
        if (current.value == value) {
            return true;
        }
        return (value < current.value) ? containsNodeRecursive(current.left, value)
                : containsNodeRecursive(current.right, value);
    }

    /**
     * Deleting an Element
     * 
     * a node has no children – this is the simplest case; we just need to replace t
     *  is node with null in its parent node
     * 
     * a node has exactly one child – in the parent node, we replace this node w
     * th its only child.
     * 
     * a node has two children – this is the most complex case because it requires a
     *  tree reorganization
     * 
     * @param current
     * @param value
     * @return
     */
    private Node deleteRecursive(Node current, int value) {
        if (current == null) {
            return null;
        }

        if (value == current.value) {
            // Delete Node here

            // if a node has no children – this is the simplest case; we just need to r
            // place this node with null in its parent node
            if (current.left == null && current.right == null) {
                return null;
            }

            // if a node has exactly one child – in the parent node, we replace this node w
            // 
            // th its only child.
            if (current.left == null) {
                return current.right;
            }

            if (current.right == null) {
                return current.left;
            }

            // a node has two children , find the smallest Value
            int smallestValue = findSmallestValue(current.right);
            current.value = smallestValue;
            current.right = deleteRecursive(current.right, smallestValue);
            return current;
        }

        if (value < current.value) {
            current.left = deleteRecursive(current.left, value);
            return current;
        }

        current.right = deleteRecursive(current.right, value);
        return current;
    }

    private int findSmallestValue(Node node) {
        return node.left == null ? root.value : findSmallestValue(node.left);
    }
}