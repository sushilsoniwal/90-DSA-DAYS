package com.company;

import java.util.Scanner;

public class Build_Tree {
    static Scanner sc = null;

    // Node Class To Create Node With Desired Data.
    static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    // Method To Create A Tree Step-By-Step.
    static Node createTree() {
        System.out.print("Enter Data:- ");
        int data = sc.nextInt();

        if (data == -1) {
            return null;
        }

        Node root = new Node(data);

        System.out.println("Enter left for " + data);
        root.left = createTree(); // Recursive Call For Left.
        System.out.println("Enter right for " + data);
        root.right = createTree(); // Recursive Call For Right.

        return root;
    }

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        Node root = createTree();
    }
}