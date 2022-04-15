package com.company;

public class SLL {
    public Node head;
    public int size;

    public SLL() {
        size = 0;
    }

    /* ********** INSERTION IN SINGLY LINKED LIST ********** */

    // (1) Insert At First Position.
    public void insertFirst(int value) {
        Node node = new Node(value);
        node.next = head;
        head = node;
        size++;
    }

    // (2) Insert At Last Position.
    public void insertLast(int value) {
        Node node = new Node(value);
        // Head is Null i.e no element presents in linked list, so insert At The First Position.
        if (head == null) {
            insertFirst(value);
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = node;
        size++;
    }

    // (3) Insert At A Target Index.
    public void insert(int val, int index) {
        if (index == 0) {
            insertFirst(val);
            return;
        }
        if (index == size) {
            insertLast(val);
        }

        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        Node node = new Node(val, temp.next);
        temp.next = node;
        size++;
    }

    // Method To Display Singly Linked List.
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("End");
    }

    /* ********** DELETION IN SINGLY LINKED LIST ********** */

    // (1) Delete First Node.
    public void deleteFirst() {
        if (head == null) {
            System.out.println("List is already empty");
            return;
        }
        head = head.next;
        size--;
    }

    // (2) Delete Last Node.
    public void deleteLast() {
        // If List Is Empty.
        if (head == null) {
            System.out.println("List is already empty");
            return;
        }

        // If list has only one node.
        if (head.next == null) {
            head = null;
            return;
        }
        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
        size--;
    }

    // (3) Delete the node of a target index.
    public void delete(int index) {
        if (index == 0) {
            deleteFirst();
            return;
        }
        if (index == size) {
            deleteLast();
            return;
        }
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
        size--;
    }

    /* ********** FIND THE TARGET NODE ********** */
    public Node find(int val) {
        Node temp = head;
        while (temp != null) {
            if (temp.data == val) {
                return temp;
            }
            temp = temp.next;
        }
        return null; // Not Found
    }

    public class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }
}
