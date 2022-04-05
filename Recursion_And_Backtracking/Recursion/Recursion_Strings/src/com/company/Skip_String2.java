package com.company;

/* => Skip A String "bro" Not "brown" From A Given String.<= */

public class Skip_String2 {
    public static void main(String[] args) {
        System.out.println(skip("the brown fox is my bro", ""));
        System.out.println(skip2("the brown fox is my bro"));
    }
    //------------------------------------------------------------------

    // Method-01.
    static String skip(String str, String ans) {
        if (str.isEmpty()) {
            return ans;
        }

        // String is starts with "bro" but not with "brown".
        if (str.startsWith("bro") && !str.startsWith("brown")) {
            return skip(str.substring(3), ans); // 3:- Length of removed string("bro")
        }

        return skip(str.substring(1), ans + str.charAt(0));
    }
    //------------------------------------------------------------------

    // Method-01.
    static String skip2(String str) {
        if (str.isEmpty()) {
            return "";
        }

        // String is starts with "bro" but not with "brown".
        if (str.startsWith("bro") && !str.startsWith("brown")) {
            return skip2(str.substring(3)); // 3:- Length of removed string("bro")
        }

        return str.charAt(0) + skip2(str.substring(1));
    }
}
