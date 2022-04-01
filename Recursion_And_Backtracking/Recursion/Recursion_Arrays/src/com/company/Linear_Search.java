package com.company;

public class Linear_Search {
    public static void main(String[] args) {
        int[] arr = {3, 1, 9, 11, 2, 65};
        int target = 22;
        System.out.println(search(arr, 0, target));
    }
    //-------------------------------------------------------------------

    // ***** Linear Search Using Recursion *****
    static int search(int[] arr, int index, int target) {
        if (index == arr.length) {
            return -1; //Target element isn't present in array.
        }
        if (arr[index] == target) {
            return index;
        }
        return search(arr, index + 1, target);
    }
}
