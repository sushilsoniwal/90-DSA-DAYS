package com.company;

class MyStack_LL {
    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            next = null;
        }
    }

    public Node head;

    // ISEMPTY => CHECK WHETHER THE LIST IS EMPTY OR NOT.
    public boolean isEmpty() {
        return (head == null);
    }

    // PUSH => INSERTING AN ELEMENT.
    public void push(int data) {
        Node node = new Node(data);
        if (isEmpty()) {
            head = node;
            return;
        }
        node.next = head;
        head = node;
    }

    // POP => REMOVING AN ELEMENT.
    public int pop() {
        if (isEmpty()) {
            return -1;
        }
        Node top = head;
        head = head.next;
        return top.data;
    }

    // PEEK => RETURN THE ELEMENT PRESENT AT THE TOP.
    public int peek() {
        if (isEmpty()) {
            return -1;
        }
        Node top = head;
        return top.data;
    }
}


public class Stack_LinkedList {
    public static void main(String[] args) {
        MyStack_LL st = new MyStack_LL();
        st.push(7);
        st.push(5);
        st.push(1);
        st.push(2);

        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.peek());
    }
}
