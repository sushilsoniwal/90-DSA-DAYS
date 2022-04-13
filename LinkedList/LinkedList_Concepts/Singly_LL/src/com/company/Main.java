package com.company;

public class Main {

    public static void main(String[] args) {
        SLL list = new SLL();

        System.out.print("List after inserting at first position:- ");
        list.insertFirst(51);
        list.insertFirst(25);
        list.insertFirst(22);
        list.insertFirst(8);
        list.insertFirst(13);
        list.display();
        System.out.println("The size is:- " + list.size);

        System.out.print("List after inserting at last position:- ");
        list.insertLast(3);
        list.insertLast(5);
        list.display();
        System.out.println("The size is:- " + list.size);

        System.out.print("List after inserting at given position:- ");
        list.insert(2, 2);
        list.display();
        System.out.println("The size is:- " + list.size);

        System.out.print("list after deleting the first node:- ");
        list.deleteFirst();
        list.display();
        System.out.println("The size is:- " + list.size);

        System.out.print("List after deleting the last node:- ");
        list.deleteLast();
        list.display();
        System.out.println("The size is:- " + list.size);

        System.out.print("List after deleting the node of a given index:- ");
        list.delete(2);
        list.display();
        System.out.println("The size is:- " + list.size);
    }
}
