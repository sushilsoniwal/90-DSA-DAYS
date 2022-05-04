package com.company;

public class Boundry_Traversal {
    static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    /* Function To Implement Boundary Travel. */
    public static void Boundary(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");

        // Print the left boundary in top-down manner.
        Boundary_Left(root.left);

        // Print all leaf nodes
        Print_Leaves(root.left);
        Print_Leaves(root.right);

        // Print the right boundary in bottom-up manner
        Boundary_Right(root.right);
    }

    private static void Boundary_Right(Node root) {
        if (root == null)
            return;

        if (root.right != null) {
            // to ensure bottom up order, first call for right
            // subtree, then print this node
            Boundary_Right(root.right);
            System.out.print(root.data + " ");
        } else if (root.left != null) {
            Boundary_Right(root.left);
            System.out.print(root.data + " ");
        }
        // do nothing if it is a leaf node, this way we avoid
        // duplicates in output
    }

    private static void Print_Leaves(Node root) {
        if (root == null) {
            return;
        }
        Print_Leaves(root.left);
        // Print it if it is a leaf node
        if (root.left == null && root.right == null)
            System.out.print(root.data + " ");
        Print_Leaves(root.right);
    }

    private static void Boundary_Left(Node root) {
        if (root == null)
            return;

        if (root.left != null) {
            // to ensure top down order, print the node
            // before calling itself for left subtree
            System.out.print(root.data + " ");
            Boundary_Left(root.left);
        } else if (root.right != null) {
            System.out.print(root.data + " ");
            Boundary_Left(root.right);
        }
        // do nothing if it is a leaf node, this way we avoid
        // duplicates in output
    }

    public static void main(String[] args) {
        Node root = new Node(20);
        root.left = new Node(8);
        root.left.left = new Node(4);
        root.left.right = new Node(12);
        root.left.right.left = new Node(10);
        root.left.right.right = new Node(14);
        root.right = new Node(22);
        root.right.right = new Node(25);

        Boundary(root);
    }
}

