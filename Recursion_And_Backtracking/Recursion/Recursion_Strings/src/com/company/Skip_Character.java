package com.company;

/* => SKIP A CHARACTER 's' FROM A GIVEN STRING <= */

public class Skip_Character {
    public static void main(String[] args) {
        System.out.println(skipChar2("sushil", ""));
        skipChar1("sushil", "");
        System.out.println(skipChar3("sushil"));
    }
    //----------------------------------------------------------------------

    // (1) Print string after removing all the 's' from it.
    static void skipChar1(String str, String ans) {
        if (str.isEmpty()) {
            System.out.println(ans);
            return;
        }

        char ch = str.charAt(0);
        if (ch == 's') {
            skipChar1(str.substring(1), ans); // skip the first character.
        } else {
            skipChar1(str.substring(1), ans + ch); // Add first character in ans string.
        }
    }
    //----------------------------------------------------------------------

    // (2) Return string after removing all the 's' from it (Pass answer string in parameters).
    static String skipChar2(String str, String ans) {
        if (str.isEmpty()) {
            return ans;
        }

        char ch = str.charAt(0);
        if (ch == 's') {
            return skipChar2(str.substring(1), ans);
        } else {
            return skipChar2(str.substring(1), ans + ch);
        }
    }
    //----------------------------------------------------------------------

    // (3) Return string after removing all the 's' from it.
    static String skipChar3(String str) {

        if (str.isEmpty()) {
            return "";
        }

        char ch = str.charAt(0);
        if (ch == 's') {
            return skipChar3(str.substring(1));
        } else {
            return ch + skipChar3(str.substring(1));
        }
    }
}
