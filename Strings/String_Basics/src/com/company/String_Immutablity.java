package com.company;

public class String_Immutablity {
    public static void main(String[] args) {

        /*
         * String objects are immutable in java hence, we can't change or modify a
         * string object but can create a new one.
         */

        String s = " Sushil ";
        s.concat(" Soniwal ");
        System.out.println(s); // Sushil

        s = s.concat(" Soniwal ");
        System.out.println(s); // Sushil Soniwal
    }
}
