
import java.util.ArrayList;

// ===================== Binary Search Tree =====================
public class L02_BinarySearchTree {

    // ===================== Node Class =====================
    public static class Node {

        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    // ===================== Insert in BST =====================
    public static Node insert(Node root, int val) {

        // If tree is empty, create new node
        if (root == null) {
            return new Node(val);
        }

        // Insert in left subtree
        if (val < root.data) {
            root.left = insert(root.left, val);
        } // Insert in right subtree
        else {
            root.right = insert(root.right, val);
        }

        return root;
    }

    // ===================== Inorder Traversal =====================
    // Inorder of BST gives sorted order
    public static void inorder(Node root) {
        if (root == null) {
            return;
        }

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    // ===================== Search in BST =====================
    public static boolean search(Node root, int key) {

        // Base case: tree empty or key found
        if (root == null) {
            return false;
        }

        if (root.data == key) {
            return true;
        }

        // Search in left subtree
        if (key < root.data) {
            return search(root.left, key);
        } // Search in right subtree
        else {
            return search(root.right, key);
        }
    }

    // ===================== Delete a Node in BST =====================
    public static Node delete(Node root, int val) {

        // Base case
        if (root == null) {
            return null;
        }

        // Traverse left subtree
        if (val < root.data) {
            root.left = delete(root.left, val);
        } // Traverse right subtree
        else if (val > root.data) {
            root.right = delete(root.right, val);
        } // Node found
        else {

            // Case 1: No child (leaf node)
            if (root.left == null && root.right == null) {
                return null;
            }

            // Case 2: One child
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            // Case 3: Two children
            // Find inorder successor (smallest in right subtree)
            Node inorderSuccessor = findMin(root.right);
            root.data = inorderSuccessor.data;
            root.right = delete(root.right, inorderSuccessor.data);
        }

        return root;
    }

    // ===================== Find Minimum Node =====================
    public static Node findMin(Node root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }

    // ===================== Print in Range =====================
    // Prints all nodes with values in range [k1, k2]
    public static void printInRange(Node root, int k1, int k2) {

        if (root == null) {
            return;
        }

        // If current node is in range, check both sides
        if (root.data >= k1 && root.data <= k2) {
            printInRange(root.left, k1, k2);
            System.out.print(root.data + " ");
            printInRange(root.right, k1, k2);
        } // If current node is smaller, go right
        else if (root.data < k1) {
            printInRange(root.right, k1, k2);
        } // If current node is larger, go left
        else {
            printInRange(root.left, k1, k2);
        }
    }

    // ===================== Root to Leaf Paths =====================
    public static void printRootToLeaf(Node root, ArrayList<Integer> path) {

        if (root == null) {
            return;
        }

        // Add current node to path
        path.add(root.data);

        // If leaf node, print the path
        if (root.left == null && root.right == null) {
            for (int i = 0; i < path.size(); i++) {
                System.out.print(path.get(i) + " ");
            }
            System.out.println();
        } // Recurse for left and right subtree
        else {
            printRootToLeaf(root.left, path);
            printRootToLeaf(root.right, path);
        }

        // Backtrack
        path.remove(path.size() - 1);
    }

    // ===================== Main Method =====================
    public static void main(String[] args) {

        int values[] = {5, 1, 3, 4, 2, 7};

        Node root = null;

        // Build BST
        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
        }

        // Print inorder traversal
        System.out.print("Inorder Traversal: ");
        inorder(root);

        int key = 4;
        if (search(root, key)) {
            System.out.println("\nKey " + key + " found in BST");
        } else {
            System.out.println("Key " + key + " not found in BST");
        }

        // Delete a node
        int deleteVal = 3;
        root = delete(root, deleteVal);

        System.out.print("Inorder after deletion: ");
        inorder(root);

        // Print in Range
        int k1 = 2, k2 = 5;
        System.out.print("\nNodes in range [" + k1 + ", " + k2 + "]: ");
        printInRange(root, k1, k2);

        // Root to Leaf Paths
        System.out.println("Root to Leaf Paths:");
        printRootToLeaf(root, new ArrayList<>());

    }
}
