package com.company;

import java.util.ArrayList;

public class Print_Possible_Permutations {
    public static void main(String[] args) {
//        permutations("", "ABC");
        System.out.println(allPermutations("", "ABC"));
    }
    //-----------------------------------------------------------------------------------------

    // (1) Print Possible Permutations.
    static void permutations(String ans, String str) {
        if (str.isEmpty()) {
            System.out.println(ans);
            return;
        }
        char ch = str.charAt(0);

        for (int i = 0; i <= ans.length(); i++) {
            String f = ans.substring(0, i);
            String s = ans.substring(i, ans.length());
            permutations(f + ch + s, str.substring(1));
        }
    }
    //-----------------------------------------------------------------------------------------

    // (2) Return All The Possible Permutations In An ArrayList.
    static ArrayList<String> allPermutations(String ans, String str) {
        if (str.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(ans);
            return list;
        }
        char ch = str.charAt(0);
        ArrayList<String> local = new ArrayList<>();

        for (int i = 0; i <= ans.length(); i++) {
            String f = ans.substring(0, i);
            String s = ans.substring(i, ans.length());
            local.addAll(allPermutations(f + ch + s, str.substring(1)));
        }
        return local;
    }
}