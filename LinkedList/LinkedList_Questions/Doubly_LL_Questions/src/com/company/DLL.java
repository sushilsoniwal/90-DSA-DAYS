package com.company;

public class DLL {
    public Node head;

    // (1):-  https://bit.ly/3McAOSC
    public static Node reverseDLL(Node head) {
        if (head == null || head.next == null) return head;
        Node temp = null;
        Node curr = head;
        while (curr != null) {
            temp = curr.prev;
            curr.prev = curr.next;
            curr.next = temp;
            curr = curr.prev;
        }
        return temp.prev;
    }

    // (2):- https://bit.ly/3vksdX3
    public void addNode(Node head_ref, int pos, int data) {
        Node temp = head_ref;
        for (int i = 1; i <= pos; i++) {
            temp = temp.next;
        }
        Node node = new Node(data);
        node.next = temp.next;
        temp.next = node;
        node.prev = temp;
    }

    public class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
        }
    }
}
