package com.company;

import java.util.Stack;

public class PostOrder_Iterative {
    static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    /* Iterative PostOrder Traversal Using 2 Stacks. */
    public static void PostOrder_TwoStacks(Node root) {
        if (root == null) {
            return;
        }
        Stack<Node> s1 = new Stack<>();
        s1.push(root);
        Stack<Integer> s2 = new Stack<>();

        while (!s1.empty()) {
            Node curr = s1.pop();
            s2.push(curr.data);

            if (curr.left != null) {
                s1.push(curr.left);
            }

            if (curr.right != null) {
                s1.push(curr.right);
            }
        }

        while (!s2.empty()) {
            System.out.print(s2.pop() + " ");
        }
    }

    /* Iterative PostOrder Traversal Using 1 Stack. */
    public static void PostOrder_OneStack(Node root) {
        Node curr = root;
        Stack<Node> st = new Stack<>();
        while (curr != null || !st.empty()) {
            if (curr != null) {
                st.push(curr);
                curr = curr.left;
            } else {
                Node temp = st.peek().right;
                if (temp == null) {
                    temp = st.peek();
                    st.pop();
                    System.out.print(temp.data + " ");
                    while (!st.empty() && temp == st.peek().right) {
                        temp = st.peek();
                        st.pop();
                        System.out.print(temp.data + " ");
                    }
                } else {
                    curr = temp;
                }
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

        PostOrder_TwoStacks(root);
        PostOrder_OneStack(root);
    }
}
