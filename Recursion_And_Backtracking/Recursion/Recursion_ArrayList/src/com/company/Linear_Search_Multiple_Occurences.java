package com.company;

import java.util.ArrayList;

public class Linear_Search_Multiple_Occurences {
    public static void main(String[] args) {
        int[] arr = {4, 6, 2, 4, 7, 3, 4, 4};

        first(arr, 4, 0);
        System.out.println(list);

        ArrayList<Integer> ans = second(arr, 4, 0, new ArrayList<>());
        System.out.println(ans);

        System.out.println(third(arr, 4, 0));
    }
    //---------------------------------------------------------------------------

    // By Creating An ArrayList Outside.
    static ArrayList<Integer> list = new ArrayList<>();

    static void first(int[] arr, int target, int index) {
        if (index == arr.length) {
            return;
        }
        if (arr[index] == target) {
            list.add(index);
        }
        first(arr, target, index + 1);
    }
    //---------------------------------------------------------------------------

    // By Creating An ArrayList In Parameter.
    static ArrayList<Integer> second(int[] arr, int target, int index, ArrayList<Integer> list) {
        if (index == arr.length) {
            return list;
        }
        if (arr[index] == target) {
            list.add(index);
        }
        return second(arr, target, index + 1, list);
    }
    //---------------------------------------------------------------------------

    // By Creating An ArrayList In Function Body.
    static ArrayList<Integer> third(int[] arr, int target, int index) {
        ArrayList<Integer> list = new ArrayList<>();

        if (index == arr.length) {
            return list;
        }

        // this will contain answer for that function call only
        if (arr[index] == target) {
            list.add(index);
        }
        ArrayList<Integer> ansFromBelowCalls = third(arr, target, index + 1);

        list.addAll(ansFromBelowCalls);

        return list;
    }
}
