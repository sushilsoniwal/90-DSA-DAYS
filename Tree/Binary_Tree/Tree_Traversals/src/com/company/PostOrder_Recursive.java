package com.company;

public class PostOrder_Recursive {
    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    /* PostOrder Traversal:- left->right->root. */
    public static void PostOrder(Node root) {
        if (root.data == -1) {
            return;
        }
        PostOrder(root.left);
        PostOrder(root.right);
        System.out.println(root.data);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.right.left = new Node(-1);
        root.right.right = new Node(-1);
        root.left.left = new Node(4);
        root.left.left.left = new Node(-1);
        root.left.left.right = new Node(-1);
        root.left.right = new Node(5);
        root.left.right.left = new Node(-1);
        root.left.right.right = new Node(-1);

        PostOrder(root);
    }
}
