package com.company;

class CircularQueue {
    static int[] arr;
    static int size;
    static int front = -1, rear = -1;

    public CircularQueue(int size) {
        this.size = size;
        arr = new int[size];
    }

    // IsEmpty =>
    public boolean isEmpty() {
        return (front == -1 && rear == -1);
    }

    // IsFull =>
    public boolean isFull() {
        return ((rear + 1) % size == front);
    }

    // Enqueue =>
    public void enqueue(int data){
        if (isFull()){
            return;
        }
        if (front==-1){
            front=0;
        }
        rear=(rear+1)%size;
        arr[rear]=data;
    }

    // Dequeue =>
    public int dequeue(){
        if (isEmpty()){
            return -1;
        }
        int res = arr[front];
        if (front==rear){
            front=rear=-1;
        }else{
            front = (front+1)%size;
        }
        return res;
    }
}

public class Main {
    public static void main(String[] args) {
        CircularQueue q = new CircularQueue(5);
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(5);
        System.out.println(q.dequeue());
        q.enqueue(6);
        System.out.println(q.dequeue());
        q.enqueue(7);

        while (!q.isEmpty()) {
            System.out.println(q.dequeue());
        }
    }
}
