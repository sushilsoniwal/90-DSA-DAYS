package com.company;

public class Intro {

    public static void main(String[] args) {

        /* StringBuffer Constructors :- There are 3 constructors. */

        // (1):- It creates an empty String buffer with the initial capacity of 16.
        StringBuffer sbf1 = new StringBuffer();

        // (2):- It creates a String buffer with the specified string.
        StringBuffer sbf2 = new StringBuffer("Sushil");

        // (3):- It creates an empty String buffer with the specified capacity.
        StringBuffer sbf3 = new StringBuffer(10);

        System.out.println(sbf1);
        System.out.println(sbf2);
        System.out.println(sbf3);

    }
}
