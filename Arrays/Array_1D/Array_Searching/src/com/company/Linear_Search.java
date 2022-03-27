package com.company;

public class Linear_Search {
    public static void main(String[] args) {
        int[] arr = { 34, 21, 78, 89, 13, 45, 24 };
        int target = 78;
        System.out.println(linear(arr, target));
    }
    // *******************************************************************

    // Fuction to implement linear search. => Time Complexity = O(N)
    static int linear(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target)
                return i;
        }
        return -1;
    }
}
