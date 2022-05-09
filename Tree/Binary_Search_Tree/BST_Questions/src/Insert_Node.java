/* Insert a node in a BST:- https://bit.ly/3kSuWSL .*/

public class Insert_Node {
    static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    // Method To Insert A Node.
    public static Node insert(Node root, int key) {
        if (root == null) {
            root = new Node(key);
            return root;
        }
        if (key < root.data) {
            root.left = insert(root.left, key);
        } else if (key > root.data) {
            root.right = insert(root.right, key);
        }
        return root;
    }

    public static void main(String[] args) {
        Node root = new Node(2);
        root.right = new Node(81);
        root.right.left = new Node(42);
        root.right.right = new Node(87);
        root.right.left.right = new Node(66);
        root.right.right.right = new Node(90);
        root.right.left.right.left = new Node(45);

        insert(root, 33);
    }
}
