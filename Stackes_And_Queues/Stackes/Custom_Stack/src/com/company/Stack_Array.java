package com.company;

// Our Custom Stack Class.
class MyStack {
    int[] arr;
    int top;
    int size;

    public MyStack(int size) {
        this.size = size;
        top = -1;
        arr = new int[size];
    }

    // PUSH => INSERTING AN ELEMENT.
    public void push(int data) {
        if (top == size - 1) {
            System.out.println("Stack Is Full");
        }
        top++;
        arr[top] = data;
    }

    // POP => REMOVING AN ELEMENT.
    public int pop() {
        if (top == -1) {
            System.out.println("Stack Is Empty");
        }
        int res = arr[top];
        top--;
        return res;
    }

    // PEEK => ELEMENT PRESENT AT THE TOP.
    public int peek() {
        if (top == -1) {
            System.out.println("Stack Is Empty");
        }
        return arr[top];
    }
}

public class Stack_Array {
    public static void main(String[] args) {
        MyStack st = new MyStack(5);
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);

        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.peek());
    }
}
