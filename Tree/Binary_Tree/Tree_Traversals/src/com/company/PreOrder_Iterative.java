package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PreOrder_Iterative {
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

    /* PreOrder Traversal Iteratively. */
    public static void preOrder(Node root) {
        Stack<Node> st = new Stack<>();
        st.push(root);
        if (root == null) {
            return;
        }

        while (!st.empty()) {
            Node curr = st.peek();
            System.out.print(curr.data + " ");
            st.pop();

            if (curr.right != null) {
                st.push(curr.right);
            }
            if (curr.left != null) {
                st.push(curr.left);
            }
        }
    }

    /* PreOrder Traversal Iteratively Using ArrayList. */
    public static List<Integer> preorderTraversal(Node root) {
        ArrayList<Integer> ans = new ArrayList<Integer>();
        Stack<Node> st = new Stack<>();
        st.push(root);
        if (root == null) {
            return ans;
        }

        while (!st.empty()) {
            Node curr = st.peek();
            ans.add(curr.data);
            st.pop();

            if (curr.right != null) {
                st.push(curr.right);
            }
            if (curr.left != null) {
                st.push(curr.left);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(8);
        root.right = new Node(2);
        root.left.left = new Node(3);
        root.left.right = new Node(5);
        root.right.left = new Node(2);

        preOrder(root);
    }
}
