/* Delete a node from BST:- https://bit.ly/3FqB8ef .*/

import java.util.LinkedList;
import java.util.Queue;

public class Delete_Node {
    static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    // Method To Delete Node.
    public static Node deleteNode(Node root, int key) {
        if (root == null) {
            return null;
        } else if (root.data < key) {
            root.right = deleteNode(root.right, key);
        } else if (root.data > key) {
            root.left = deleteNode(root.left, key);
        } else {
            // 0 Child
            if (root.left == null && root.right == null) {
                return null;
            }

            // Only 1 child in Left.
            else if (root.right == null) {
                return root.left;
            }

            // Only 1 child in Right.
            else if (root.left == null) {
                return root.right;
            }

            // Having 2 childrens.
            else {
                Node min = findMin(root.right);
                root.data = min.data;
                return deleteNode(root.right, root.data);
            }
        }
        return root;
    }

    // Method to find minimum node in right subtree.
    private static Node findMin(Node root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }

    /* Code For Level Order Traversal. */
    public static void levelOrder(Node root) {
        if (root == null) {
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        while (!q.isEmpty()) {
            Node curr = q.remove();
            if (curr == null) {
                System.out.println();
                //queue empty
                if (q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                }
            } else {
                System.out.print(curr.data + " ");
                if (curr.left != null) {
                    q.add(curr.left);
                }
                if (curr.right != null) {
                    q.add(curr.right);
                }
            }
        }
    }


    public static void main(String[] args) {
        Node root = new Node(15);
        root.left = new Node(13);
        root.right = new Node(20);
        root.left.left = new Node(12);
        root.left.right = new Node(14);
        root.right.left = new Node(18);
        root.right.right = new Node(22);
        root.left.left.left = new Node(10);
        root.right.right.left = new Node(21);
        root.right.right.right = new Node(23);
        root.left.left.left.left = new Node(9);
        root.left.left.left.right = new Node(11);

        System.out.println("Before Deleting Any Node From BST :- ");
        levelOrder(root);

        System.out.println("After Deleting 15 From BST :- ");
        deleteNode(root, 15);
        levelOrder(root);
    }
}
