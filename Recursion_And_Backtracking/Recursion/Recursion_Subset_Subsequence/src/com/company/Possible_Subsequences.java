package com.company;

/* => PRINT/RETURN ALL POSSIBLE SUBSEQUENCES OF A STRING <= */

import java.util.ArrayList;
import java.util.Arrays;

public class Possible_Subsequences {
    public static void main(String[] args) {
//        subseq1("ABC", "");
        System.out.println(subseq2("ABC", ""));
    }
    //-----------------------------------------------------------------

    // Method-01:- Passing ans string in arguments.
    static void subseq1(String str, String ans) {
        // Base Case
        if (str.isEmpty()) {
            System.out.print(ans + " ");
            return;
        }

        char ch = str.charAt(0); // Character Present At First Position.

        // Taking The Element.
        subseq1(str.substring(1), ans + ch);

        // Ignoring The Element.
        subseq1(str.substring(1), ans);
    }//-----------------------------------------------------------------

    // Method-02:- Return All Subsequences In An ArrayList.
    static ArrayList<String> subseq2(String str, String ans) {
        if (str.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(ans);
            return list;
        }

        char ch = str.charAt(0); // Character Present At First Position.

        // Taking The Element.
        ArrayList<String> left = subseq2(str.substring(1), ans + ch);

        // Ignoring The Element.
        ArrayList<String> right = subseq2(str.substring(1), ans);

        // Add All The Answers In Left.
        left.addAll(right);

        // Returning The List With All The Answers.
        return left;
    }
}
