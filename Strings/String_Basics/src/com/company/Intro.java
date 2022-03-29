package com.company;

public class Intro {

    public static void main(String[] args) {

        create1();
        ch_array();
    }
    // -----------------------------------------------------------------------------------------------------

    // Declaration Of String Object.

    /*
     * (1) By using String Literal:-
     * (i) Every time JVM checks "String Constant Pool", if object already exists
     * then a reference to be pooled.
     * (ii) If string doesn't exists then an object will be created outside pool.
     */

    /*
     * (2) By using New Keyword:-
     * (1)It will create a new object in non-pool.
     */

    static void create1() {
        String str1 = "Sushil";
        String str2 = new String("Sushil");

        System.out.println(str1);
        System.out.println(str2);
    }
    // -----------------------------------------------------------------------------------------------------

    // String as a character array.
    static void ch_array() {
        char[] ch = {'J', 'A', 'V', 'A'};
        String str = new String(ch);
        System.out.println(str);
    }
}
