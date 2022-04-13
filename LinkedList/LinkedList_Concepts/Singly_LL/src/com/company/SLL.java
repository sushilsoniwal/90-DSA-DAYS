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
            System.out.println("List is empty");
            return;
        }
        head = head.next;
        size--;
    }

    // (2) Delete Last Node.
    public void deleteLast() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }
        Node temp = head;
        Node lastNode = head.next;
        while (lastNode.next != null) {
            temp = temp.next;
            lastNode = lastNode.next;
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
    public Node find(int value) {
        Node temp = head;
        while (temp != null) {
            if (temp.data == value) {
                return temp;
            }
            temp = temp.next;
        }
        return null;
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
