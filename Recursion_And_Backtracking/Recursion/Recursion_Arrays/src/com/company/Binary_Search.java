package com.company;

public class Binary_Search {
    public static void main(String[] args) {
        int[] arr = {3, 6, 8, 45, 60};
        System.out.println(search(arr, 0, arr.length - 1, 50));
    }
    //--------------------------------------------------------------------------

    // ***** Binary Search Using Recursion *****
    static int search(int[] arr, int start, int end, int target) {
        if (start > end) {
            return -1;
        }
        int mid = start + (end - start) / 2;
        if (arr[mid] == target) {
            return mid;
        }
        if (arr[mid] > target) {
            return search(arr, start, mid - 1, target);
        }
        return search(arr, mid + 1, end, target);
    }

}
