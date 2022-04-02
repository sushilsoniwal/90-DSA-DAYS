package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        /* Creation And Initialization Of An ArrayList */
        ArrayList<Integer> list = new ArrayList<>(3);

        /* ArrayList Methods */

        // (1) Add:- adds an element in arraylist.
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(44);
        list.add(38);
        list.add(11);

        // (2) Get:- return an element from arraylist.
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(3));

        // (3) Set:- set an element at a specified position in arraylist.
        list.set(1, 12);
        System.out.println(list.get(1));

        // (4) Remove:- delete the element present at a given index in arraylist.
        list.remove(2);
        System.out.println(list.size());

        // Printing the arraylist.
        System.out.println("List Before Sorting:- ");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

        // (5) sort:- Sort the arraylist.
        Collections.sort(list);
        System.out.println("List After Sorting:- ");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }
}
