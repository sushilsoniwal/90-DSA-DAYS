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

    // Recursive Method To Insert A Node.
    public static Node insertRec(Node root, int key) {
        if (root == null) {
            root = new Node(key);
            return root;
        }
        if (key < root.data) {
            root.left = insertRec(root.left, key);
        } else if (key > root.data) {
            root.right = insertRec(root.right, key);
        }
        return root;
    }

    // Iterative Method To Insert A Node.
    public static void insert(Node root, int key) {
        Node node = new Node(key);
        if (root == null) {
            root = node;
            return;
        }
        Node prev = null;
        Node temp = root;
        while (temp != null) {
            prev = temp;
            if (temp.data > key) {
                temp = temp.left;
            } else {
                temp = temp.right;
            }
        }
        if (prev == null) {
            prev = node;
        } else if (prev.data > key) {
            prev.left = node;
        } else {
            prev.right = node;
        }
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
