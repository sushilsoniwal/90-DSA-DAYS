/* Minimum element in BST:- https://bit.ly/3LZbEXE .*/

public class Minimum_Value {
    static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    // Function To Get Minimum From BST.
    public static int minimum(Node root) {
        if (root == null) {
            return -1;
        }
        Node temp = root;
        while (temp.left != null) {
            temp = temp.left;
        }
        return temp.data;
    }

    public static void main(String[] args) {
        Node root = new Node(12);
        root.left = new Node(7);
        root.left.left = new Node(4);
        root.right = new Node(81);
        root.right.left = new Node(42);
        root.right.right = new Node(87);
        root.right.left.right = new Node(66);
        root.right.right.right = new Node(90);
        root.right.left.right.left = new Node(45);

        System.out.println(minimum(root));
    }
}
