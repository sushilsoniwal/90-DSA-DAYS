package com.company;

import java.util.Stack;

public class InOrder_Iterative {
    static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    public static void inOrder(Node root) {
        Stack<Node> st = new Stack<>();

        // start from the root node (set current node to the root node).
        Node curr = root;

        // if the current node is null and the stack is also empty, we are done
        while (!st.empty() || curr != null) {
            if (curr != null) {
                st.push(curr);
                curr = curr.left;
            } else {
                if (st.empty()) {
                    break;
                }
                curr = st.pop();
                System.out.print(curr.data + " ");
                curr = curr.right;
            }
        }
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.left.right.left = new Node(8);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        root.right.right.left = new Node(9);
        root.right.right.right = new Node(10);

        inOrder(root);
    }
}
