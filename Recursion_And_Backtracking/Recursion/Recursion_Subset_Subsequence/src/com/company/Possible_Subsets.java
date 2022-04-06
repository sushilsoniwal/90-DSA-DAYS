package com.company;

public class Possible_Subsets {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        subset(arr, 0, 0);
    }
    //------------------------------------------------------------------------------------

    static void subset(int[] arr, int start, int end) {
        if (end == arr.length) {
            return;
        } else if (start > end) {
            subset(arr, 0, end + 1);
        } else {
            System.out.print("[");
            for (int i = start; i < end; i++) {
                System.out.print(arr[i] + ", ");
            }

            System.out.println(arr[end] + "]");
            subset(arr, start + 1, end);
        }
    }
}
