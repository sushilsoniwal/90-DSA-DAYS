package com.company;

/* => Skip the string that starts with "brown".<=*/

public class Skip_String1 {
    public static void main(String[] args) {
        System.out.println(skip1("The quick brown fox", ""));
        System.out.println(skip2("The quick brown fox"));
    }
    //-------------------------------------------------------------

    // Method-01
    static String skip1(String str, String ans) {
        if (str.isEmpty()) {
            return ans;
        }
        if (str.startsWith("brown")) {
            return skip1(str.substring(5), ans); // 5:- Length of the removed string (brown
        }
        return skip1(str.substring(1), ans + str.charAt(0));
    }
    //-------------------------------------------------------------

    // Method-02
    static String skip2(String str) {
        if (str.isEmpty()) {
            return "";
        }
        if (str.startsWith("brown")) {
            return skip2(str.substring(5));
        }
        return str.charAt(0) + skip2(str.substring(1));
    }
}
