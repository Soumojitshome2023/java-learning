
import java.util.LinkedList;
import java.util.Queue;

// ===================== Binary Tree Code =====================
public class BinaryTreeCode {

    // ===================== Node Class =====================
    // Public static nested class so it can be used in public methods
    public static class Node {

        int data;      // Value stored in the node
        Node left;     // Reference to left child
        Node right;    // Reference to right child

        // Constructor
        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    // Index used while building tree
    static int idx = -1;

    // ===================== Build Tree =====================
    // Builds the binary tree using preorder traversal
    // -1 represents a null node
    public static Node buildTree(int nodes[]) {
        idx++;

        if (nodes[idx] == -1) {
            return null;
        }

        Node newNode = new Node(nodes[idx]);
        newNode.left = buildTree(nodes);
        newNode.right = buildTree(nodes);

        return newNode;
    }

    // ===================== Preorder Traversal =====================
    // Order: Root → Left → Right
    public static void preOrder(Node root) {
        if (root == null) {
            return;
        }

        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    // ===================== Inorder Traversal =====================
    // Order: Left → Root → Right
    public static void inOrder(Node root) {
        if (root == null) {
            return;
        }

        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    // ===================== Postorder Traversal =====================
    // Order: Left → Right → Root
    public static void postOrder(Node root) {
        if (root == null) {
            return;
        }

        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + " ");
    }

    // ===================== Level Order Traversal =====================
    // Traverses tree level by level (BFS)
    public static void levelOrder(Node root) {
        if (root == null) {
            return;
        }

        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            Node curr = q.remove();
            System.out.print(curr.data + " ");

            if (curr.left != null) {
                q.add(curr.left);
            }

            if (curr.right != null) {
                q.add(curr.right);
            }
        }
    }

    // ===================== Count Nodes =====================
    // Returns total number of nodes in the binary tree
    public static int countNodes(Node root) {
        if (root == null) {
            return 0;
        }

        int leftNodes = countNodes(root.left);
        int rightNodes = countNodes(root.right);

        return leftNodes + rightNodes + 1;
    }

    // ===================== Sum of Node Data =====================
    // Returns sum of all node values in the binary tree
    public static int sumOfNodes(Node root) {
        if (root == null) {
            return 0;
        }

        return root.data + sumOfNodes(root.left) + sumOfNodes(root.right);
    }

    // ===================== Height of Binary Tree =====================
    // Height = max height of left/right subtree + 1
    public static int height(Node root) {
        if (root == null) {
            return 0;
        }

        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        return Math.max(leftHeight, rightHeight) + 1;
    }

    // ===================== Diameter (O(n)) =====================
    // Helper class to store height and diameter together
    public static class TreeInfo {

        int height;
        int diameter;

        TreeInfo(int height, int diameter) {
            this.height = height;
            this.diameter = diameter;
        }
    }

    // Returns both height and diameter in a single traversal
    public static TreeInfo diameter(Node root) {
        if (root == null) {
            return new TreeInfo(0, 0);
        }

        TreeInfo left = diameter(root.left);
        TreeInfo right = diameter(root.right);

        int height = Math.max(left.height, right.height) + 1;

        int diam1 = left.diameter;
        int diam2 = right.diameter;
        int diam3 = left.height + right.height + 1;

        int diameter = Math.max(diam3, Math.max(diam1, diam2));

        return new TreeInfo(height, diameter);
    }

    // ===================== Main Method =====================
    public static void main(String[] args) {

        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};

        Node root = buildTree(nodes);

        System.out.print("Preorder  : ");
        preOrder(root);

        System.out.print("\nInorder   : ");
        inOrder(root);

        System.out.print("\nPostorder: ");
        postOrder(root);

        System.out.print("\nLevel Order: ");
        levelOrder(root);

        System.out.println("\nNode Count: " + countNodes(root));
        System.out.println("Sum of Nodes: " + sumOfNodes(root));
        System.out.println("Height: " + height(root));

        System.out.println("Diameter: " + diameter(root).diameter);
    }
}
