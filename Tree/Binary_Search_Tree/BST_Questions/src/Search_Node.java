class Node {
    int data;
    Node left, right;

    public Node(int data) {
        this.data = data;
        left = right = null;
    }
}

/* Search A Node In BST :- https://bit.ly/38buwEh .*/
public class Search_Node {
    public static boolean search(Node root, int x) {
        if (root == null) {
            return false;
        }
        if (root.data == x) {
            return true;
        }
        if (root.data < x) {
            return search(root.right, x);
        }
        return search(root.left, x);
    }

    public static void main(String[] args) {
        Node root = new Node(2);
        root.right = new Node(81);
        root.right.left = new Node(42);
        root.right.right = new Node(87);
        root.right.left.right = new Node(66);
        root.right.right.right = new Node(90);
        root.right.left.right.left = new Node(45);

        System.out.println(search(root, 87));
    }
}
