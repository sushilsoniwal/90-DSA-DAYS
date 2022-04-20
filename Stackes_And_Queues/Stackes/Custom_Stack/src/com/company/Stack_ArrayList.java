package com.company;

import java.util.ArrayList;

class MyStack_AL {
    ArrayList<Integer> list = new ArrayList<>();

    // ISEMPTY => CHECK WHETHER THE LIST IS EMPTY OR NOT.
    public boolean isEmpty() {
        return (list.size() == 0);
    }

    // PUSH => INSERTING AN ELEMENT.
    public void push(int data) {
        list.add(data);
    }

    // POP => REMOVING AN ELEMENT.
    public int pop() {
        if (isEmpty()) {
            return -1;
        }
        return list.remove(list.size() - 1);
    }

    // PEEK => RETURN THE ELEMENT PRESENT AT THE TOP.
    public int peek() {
        if (isEmpty()) {
            return -1;
        }
        return list.get(list.size() - 1);
    }
}

public class Stack_ArrayList {
    public static void main(String[] args) {
        MyStack_AL st = new MyStack_AL();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);

        while (!st.isEmpty()) {
            System.out.println(st.peek());
            st.pop();
        }
    }
}
