package com.company;

public class String_Comparison {
    public static void main(String[] args) {
        comp1();
        comp2();
    }
    // ----------------------------------------------------------------------------------------

    // (1) Method-01:- .equals() => Compares Value.
    static void comp1() {
        String s1 = "Sushil";
        String s2 = new String("Sushil");
        String s3 = "SUSHIL";

        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s1.equalsIgnoreCase(s3));
    }
    // ----------------------------------------------------------------------------------------

    // (2) Method-02:- == (Method) => Compares Reference Not Values.
    static void comp2() {
        String s1 = "Sushil";
        String s2 = new String("Sushil");
        String s3 = "Sushil";

        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
    }
}
