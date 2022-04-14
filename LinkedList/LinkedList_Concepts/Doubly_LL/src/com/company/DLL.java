package com.company;

public class DLL {
    private Node head;
    public int size;

    public DLL() {
        size = 0;
    }

    /* ********** INSERTION IN DOUBLY LINKED LIST ********** */

    // (1) Insert At First Position.
    public void insertFirst(int value) {
        Node node = new Node(value);
        node.next = head;
        node.previous = null;
        if (head != null) {
            head.previous = node;
        }
        head = node;
        size++;
    }

    // (2) Insert At Last Position.
    public void insertLast(int value) {
        Node node = new Node(value);
        if (head == null) {
            node.previous = null;
            head = node;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = node;
        node.next = null;
        node.previous = temp;
        size++;
    }

    // (3) Insert At A Target Index.
    public void insert(int value, int index) {
        if (index == 0) {
            insertFirst(value);
            return;
        }
        if (index == size) {
            insertLast(value);
            return;
        }
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        Node node = new Node(value, temp.next);
        temp.next = node;
        node.previous = temp;
        size++;
    }

    /* ********** DELETION IN DOUBLY LINKED LIST ********** */

    // (1) Delete First Node.
    public void deleteFirst() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        head = head.next;
        head.previous = null;
        size--;
    }

    // (2) Delete Last Node.
    public void deleteLast() {
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.previous.next = null;
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

    // Display Doubly Linked List In Reverse.
    public Node displayRev() {
        Node temp = null;
        Node curr = head;
        while (curr != null) {
            temp = curr.previous;
            curr.previous = curr.next;
            curr.next = temp;
            curr = curr.previous;
        }
        return temp.previous;
    }

    // Method To Display Linked List.
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("End");
    }

    public class Node {
        int data;
        Node next;
        Node previous;

        public Node(int data) {
            this.data = data;
        }

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }

        public Node(int data, Node next, Node previous) {
            this.data = data;
            this.next = next;
            this.previous = previous;
        }
    }
}
